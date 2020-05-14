package com.example.demo.services.impl;

import com.example.demo.repositories.ParticipantRepository;
import com.example.demo.repositories.TournamentRepository;
import com.example.demo.services.DashboardService;
import com.example.demo.viewModels.AdminPageViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardServiceImpl implements DashboardService {

    @Autowired
    ParticipantRepository participantRepository;

    @Autowired
    TournamentRepository tournamentRepository;


    @Override
    public AdminPageViewModel getDashboard() {
        AdminPageViewModel adminPageViewModel = new AdminPageViewModel();
        adminPageViewModel.setParticipantsAmount(participantRepository.count());
        adminPageViewModel.setTournamentsAmount(tournamentRepository.count());
        adminPageViewModel.setGymsAmount(0L);
        adminPageViewModel.setNewsAmount(0L);
        return adminPageViewModel;
    }

}
