package com.example.demo.controllers;


import com.example.demo.services.TournamentService;
import com.example.demo.viewModels.TournamentViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin
@RestController
public class TournamentController {
    @Autowired
    private TournamentService tournamentService;

    @PostMapping(value = "tournaments/add")
    public Boolean addTournament(@RequestBody TournamentViewModel tournamentViewModel) {
        tournamentService.addTournament(tournamentViewModel);
        return true;
    }

    @GetMapping("tournaments/getAll")
    public Set<TournamentViewModel> getAll() {
        return tournamentService.getAll();
    }

}
