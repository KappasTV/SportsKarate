package com.example.demo.viewModels;

import com.example.demo.models.Category;

public class CategoryViewModel {

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryViewModel(Category category) {
        this.setName(category.getName());
        this.setId(category.getId());
    }

    public CategoryViewModel(){}
}
