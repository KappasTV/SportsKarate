package com.example.demo.viewModels;

import com.example.demo.models.Participant;

import java.util.HashSet;
import java.util.Set;

public class TournamentViewModel {
    private String name;

    private Set<Participant> participants = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Participant> participants) {
        this.participants = participants;
    }

    public TournamentViewModel() {}
}
