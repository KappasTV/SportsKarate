package com.example.demo.services;

import com.example.demo.viewModels.ParticipantViewModel;
import com.example.demo.viewModels.TournamentViewModel;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Set;

public interface ParticipantService {
    Boolean addParticipant(ParticipantViewModel participantViewModel);
    Set<ParticipantViewModel> getAll();
}
