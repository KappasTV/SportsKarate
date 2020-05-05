package com.example.demo.services.impl;

import com.example.demo.models.Participant;
import com.example.demo.models.Tournament;
import com.example.demo.repositories.ParticipantRepository;
import com.example.demo.repositories.TournamentRepository;
import com.example.demo.services.TournamentService;
import com.example.demo.viewModels.TournamentViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
public class TournamentServiceImpl implements TournamentService {

    @Autowired
    TournamentRepository tournamentRepository;

    @Autowired
    ParticipantRepository participantRepository;

    @Override
    public Boolean addTournament(TournamentViewModel tournamentViewModel) {
        Tournament tournament = new Tournament();
        tournament.setName(tournamentViewModel.getName());
        tournament.setParticipants(new HashSet<>());
        tournamentRepository.save(tournament);
        return true;
    }


    @Override
    public Boolean deleteTournament(TournamentViewModel tournamentViewModel) {
        tournamentRepository.deleteById(tournamentViewModel.getId());
        return true;
    }

    @Override
    public Set<TournamentViewModel> getAll() {
        Set<TournamentViewModel> tournamentViewModels = new HashSet<>();
        tournamentRepository.findAll().forEach(tournament -> {
            TournamentViewModel tournamentViewModel = new TournamentViewModel();
            tournamentViewModel.setId(tournament.getId());
            tournamentViewModel.setName(tournament.getName());
            tournamentViewModel.setParticipants(tournament.getParticipants());
            tournamentViewModels.add(tournamentViewModel);
        });
        return tournamentViewModels;
    }

    @Override
    public Boolean addParticipantToTournament(TournamentViewModel tournamentViewModel, Long participantId) {
        Tournament tournament = tournamentRepository.findById(tournamentViewModel.getId()).get();
        Participant participant = participantRepository.findById(participantId).get();
        if (!tournament.getParticipants().contains(participant)) {
            tournament.getParticipants().add(participant);
            tournamentRepository.save(tournament);
        }
        return true;
    }

}
