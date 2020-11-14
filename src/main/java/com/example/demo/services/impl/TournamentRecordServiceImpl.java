package com.example.demo.services.impl;

import com.example.demo.models.Participant;
import com.example.demo.models.Tournament;
import com.example.demo.models.TournamentRecord;
import com.example.demo.repositories.ParticipantRepository;
import com.example.demo.repositories.TournamentRecordRepository;
import com.example.demo.repositories.TournamentRepository;
import com.example.demo.services.TournamentRecordService;
import com.example.demo.viewModels.TournamentRecordViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service

public class TournamentRecordServiceImpl implements TournamentRecordService {

    @Autowired
    private TournamentRecordRepository tournamentRecordRepository;

    @Autowired
    private ParticipantRepository participantRepository;

    @Autowired
    private TournamentRepository tournamentRepository;


    @Override
    public Boolean addTournamentRecord(TournamentRecordViewModel tournamentRecordViewModel) {
        Participant participant = participantRepository.findById(tournamentRecordViewModel.getParticipant().getId()).get();
        Tournament tournament = tournamentRepository.findById(tournamentRecordViewModel.getTournament().getId()).get();
        TournamentRecord tournamentRecord = new TournamentRecord();
        tournamentRecord.setPoints(tournamentRecordViewModel.getPoints());
        tournamentRecord.setParticipant(participant);
        tournamentRecord.setTournament(tournament);
        tournamentRecordRepository.save(tournamentRecord);
        return true;
    }

    @Override
    public Set<TournamentRecord> getAll() {
        Set<TournamentRecord> tournamentRecords = new HashSet<>();
        tournamentRecordRepository.findAll().forEach((tournamentRecords::add));
        return tournamentRecords;
    }
}
