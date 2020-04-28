package com.example.demo.viewModels;

import com.example.demo.models.Category;

public class ParticipantViewModel {

    private String name;

    private String surname;

    private CategoryViewModel category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public CategoryViewModel getCategory() {
        return category;
    }

    public void setCategory(CategoryViewModel category) {
        this.category = category;
    }
}
