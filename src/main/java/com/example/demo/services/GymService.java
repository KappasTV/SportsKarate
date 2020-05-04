package com.example.demo.services;

import com.example.demo.viewModels.GymViewModel;

import java.util.Set;

public interface GymService {
    Boolean addGym(GymViewModel gymViewModel);
    Set<GymViewModel> getAll();
}
