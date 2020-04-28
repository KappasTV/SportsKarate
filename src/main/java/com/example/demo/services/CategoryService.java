package com.example.demo.services;

import com.example.demo.viewModels.CategoryViewModel;

import java.util.Set;

public interface CategoryService {
    Boolean addCategory(CategoryViewModel categoryViewModel);
    Set<CategoryViewModel> getAll();
}
