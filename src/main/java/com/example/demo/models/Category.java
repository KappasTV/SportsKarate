package com.example.demo.models;


import com.example.demo.viewModels.CategoryViewModel;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category(CategoryViewModel categoryViewModel) {
        this.setName(categoryViewModel.getName());
    }

    public Category(){};
}
