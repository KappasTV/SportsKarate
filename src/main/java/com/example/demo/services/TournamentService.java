package com.example.demo.services;

import com.example.demo.viewModels.TournamentViewModel;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface TournamentService {
    Set<TournamentViewModel> getAll();

}
