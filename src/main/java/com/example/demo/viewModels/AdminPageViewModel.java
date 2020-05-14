package com.example.demo.viewModels;

public class AdminPageViewModel {

    private Long participantsAmount;

    private Long tournamentsAmount;

    private Long newsAmount;

    private Long gymsAmount;

    public Long getParticipantsAmount() {
        return participantsAmount;
    }

    public void setParticipantsAmount(Long participantsAmount) {
        this.participantsAmount = participantsAmount;
    }

    public Long getTournamentsAmount() {
        return tournamentsAmount;
    }

    public void setTournamentsAmount(Long tournamentsAmount) {
        this.tournamentsAmount = tournamentsAmount;
    }

    public Long getNewsAmount() {
        return newsAmount;
    }

    public void setNewsAmount(Long newsAmount) {
        this.newsAmount = newsAmount;
    }

    public Long getGymsAmount() {
        return gymsAmount;
    }

    public void setGymsAmount(Long gymsAmount) {
        this.gymsAmount = gymsAmount;
    }
}
