package com.example.demo.controllers;

import com.example.demo.services.ParticipantService;
import com.example.demo.services.TournamentService;
import com.example.demo.viewModels.ParticipantViewModel;
import com.example.demo.viewModels.TournamentViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin
@RestController
public class ParticipantController {
    @Autowired
    private ParticipantService participantService;

    @PostMapping(value = "/addParticipant")
    public Boolean addParticipant(@RequestBody ParticipantViewModel participantViewModel) {
        return participantService.addParticipant(participantViewModel);
    }


    @GetMapping("/getAllParticipants")
    public Set<ParticipantViewModel> getAll() {
        return participantService.getAll();
    }

}