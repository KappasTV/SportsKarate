package com.example.demo.services;

import com.example.demo.viewModels.TournamentViewModel;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface TournamentService {
    Boolean addTournament(TournamentViewModel tournamentViewModel);
    Boolean deleteTournament(TournamentViewModel tournamentViewModel);
    Set<TournamentViewModel> getAll();
    Boolean addParticipantToTournament(TournamentViewModel tournamentViewModel, Long participantId);
}
