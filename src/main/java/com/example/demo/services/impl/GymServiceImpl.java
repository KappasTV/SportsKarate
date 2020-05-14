package com.example.demo.services.impl;

import com.example.demo.models.Gym;
import com.example.demo.repositories.GymRepository;
import com.example.demo.services.GymService;
import com.example.demo.viewModels.GymViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class GymServiceImpl implements GymService {
    @Autowired
    GymRepository gymRepository;

    @Override
    public Boolean addGym(GymViewModel gymViewModel) {
        Gym gym = new Gym(gymViewModel);
        gymRepository.save(gym);
        return true;
    }

    @Override
    public Set<GymViewModel> getAll() {
        Set<GymViewModel> gymViewModels = new HashSet<>();
        gymRepository.findAll().forEach(gym -> {
            gymViewModels.add(new GymViewModel(gym));
        });
        return gymViewModels;
    }

    @Override
    public Boolean deleteGym(GymViewModel gymViewModel) {
        gymRepository.deleteById(gymViewModel.getId());
        return true;
    }
}
