package com.example.demo.services.impl;

import com.example.demo.models.Category;
import com.example.demo.models.Participant;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ParticipantRepository;
import com.example.demo.services.ParticipantService;
import com.example.demo.viewModels.CategoryViewModel;
import com.example.demo.viewModels.ParticipantViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

@Service
public class ParticipantServiceImpl implements ParticipantService {

    @Autowired
    ParticipantRepository participantRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public Boolean addParticipant(ParticipantViewModel participantViewModel) {
        Participant participant = new Participant();
        participant.setName(participantViewModel.getName());
        participant.setSurname(participantViewModel.getSurname());
        AtomicReference<Category> neededCategory = new AtomicReference<Category>();
        categoryRepository.findAll().forEach(category -> {
            if (category.getName().equals(participantViewModel.getCategory().getName())) {
                neededCategory.set(category);
            }
        });
        System.out.println(neededCategory.get().getId());
        participant.setCategory(neededCategory.get());
        participantRepository.save(participant);
        return true;
    }

    @Override
    public Set<ParticipantViewModel> getAll() {
        Set<ParticipantViewModel> participantViewModels = new HashSet<>();
        participantRepository.findAll().forEach(participant -> {
            ParticipantViewModel participantViewModel = new ParticipantViewModel();
            participantViewModel.setName(participant.getName());
            participantViewModel.setSurname(participant.getSurname());
            participantViewModel.setCategory(new CategoryViewModel(participant.getCategory()));
            participantViewModels.add(participantViewModel);
        });
        return participantViewModels;
    }

}