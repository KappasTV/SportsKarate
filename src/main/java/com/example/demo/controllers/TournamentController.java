package com.example.demo.controllers;


import com.example.demo.services.TournamentService;
import com.example.demo.viewModels.TournamentViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class TournamentController {
    @Autowired
    private TournamentService tournamentService;

    @GetMapping("/")
    public Set<TournamentViewModel> getAll() {
        return tournamentService.getAll();
    }

}
