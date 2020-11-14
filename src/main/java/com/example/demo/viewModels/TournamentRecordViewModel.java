package com.example.demo.viewModels;

import com.example.demo.models.Category;
import com.example.demo.models.Participant;
import com.example.demo.models.Tournament;

public class TournamentRecordViewModel {
    private long id;

    private
    Participant participant;

    private
    Tournament tournament;

    private Long points;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }
}
