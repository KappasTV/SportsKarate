package com.example.demo.services.impl;

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

    @Override
    public Set<TournamentViewModel> getAll() {
        Set<TournamentViewModel> tournamentViewModels = new HashSet<>();
        tournamentRepository.findAll().forEach(tournament -> {
            TournamentViewModel tournamentViewModel = new TournamentViewModel();
            tournamentViewModel.setName(tournament.getName());
            tournamentViewModel.setParticipants(tournament.getParticipants());
            tournamentViewModels.add(tournamentViewModel);
        });
        return tournamentViewModels;
    }

}
