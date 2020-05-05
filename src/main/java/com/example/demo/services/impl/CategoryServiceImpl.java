package com.example.demo.services.impl;


import com.example.demo.models.Category;
import com.example.demo.models.Participant;
import com.example.demo.repositories.CategoryRepository;
import com.example.demo.repositories.ParticipantRepository;
import com.example.demo.services.CategoryService;
import com.example.demo.viewModels.CategoryViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ParticipantRepository participantRepository;


    @Override
    public Boolean addCategory(CategoryViewModel categoryViewModel) {
        System.out.println(categoryViewModel.getName());
        assert categoryViewModel.getName() != null;
        Category category = new Category();
        category.setName(categoryViewModel.getName());
        categoryRepository.save(category);
        return true;
    }

    @Override
    public Set<CategoryViewModel> getAll() {
        Set<CategoryViewModel> categoryViewModels = new HashSet<>();
        categoryRepository.findAll().forEach(category -> {
            CategoryViewModel categoryViewModel = new CategoryViewModel(category);
            categoryViewModels.add(categoryViewModel);
        });
        return categoryViewModels;
    }

    @Override
    public Boolean deleteCategory(CategoryViewModel categoryViewModel) {
        Category category = categoryRepository.findById(categoryViewModel.getId()).get();
        List<Participant> participants = new ArrayList<>();
        participantRepository.findAll().forEach(participant -> {
            if (participant.getCategory().equals(category)) {
                participants.add(participant);
            }
        });
        for (Participant participant: participants) {
            participantRepository.delete(participant);
        }
        categoryRepository.delete(category);
        return true;
    }
}
