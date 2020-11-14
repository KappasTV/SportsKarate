package com.example.demo.controllers;


import com.example.demo.models.TournamentRecord;
import com.example.demo.services.TournamentRecordService;
import com.example.demo.services.TournamentService;
import com.example.demo.viewModels.TournamentRecordViewModel;
import com.example.demo.viewModels.TournamentViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin
@RestController
public class TournamentController {
    @Autowired
    private TournamentService tournamentService;

    @Autowired
    private TournamentRecordService tournamentRecordService;

    @PostMapping(value = "tournaments/add")
    public Boolean addTournament(@RequestBody TournamentViewModel tournamentViewModel) {
        return tournamentService.addTournament(tournamentViewModel);
    }

    @GetMapping("tournaments/getAll")
    public Set<TournamentViewModel> getAll() {
        return tournamentService.getAll();
    }


    @GetMapping("tournaments/getAllRecords")
    public Set<TournamentRecord> getAllRecords() {
        return tournamentRecordService.getAll();
    }


    @DeleteMapping("tournaments/delete")
    public Boolean deleteTournament(@RequestBody TournamentViewModel tournamentViewModel) {
        return tournamentService.deleteTournament(tournamentViewModel);
    }

    @PutMapping("tournaments/addParticipantToTournament")
    public Boolean addParticipantToTournament(@RequestBody TournamentRecordViewModel tournamentViewModel) {
        return tournamentRecordService.addTournamentRecord(tournamentViewModel);
    }


}
