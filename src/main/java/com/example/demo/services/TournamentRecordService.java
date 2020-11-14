package com.example.demo.services;

import com.example.demo.models.TournamentRecord;
import com.example.demo.viewModels.TournamentRecordViewModel;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface TournamentRecordService {
    Boolean addTournamentRecord(TournamentRecordViewModel tournamentRecordViewModel);
    Set<TournamentRecord> getAll();
}
