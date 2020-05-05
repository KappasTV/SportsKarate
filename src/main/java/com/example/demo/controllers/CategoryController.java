package com.example.demo.controllers;


import com.example.demo.services.CategoryService;
import com.example.demo.viewModels.CategoryViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@CrossOrigin
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "categories/add")
    public Boolean addCategory(@RequestBody CategoryViewModel categoryViewModel) {
        return categoryService.addCategory(categoryViewModel);
    }

    @DeleteMapping("categories/delete")
    public Boolean deleteCategory(@RequestBody CategoryViewModel  categoryViewModel) {
        return categoryService.deleteCategory(categoryViewModel);
    }


    @GetMapping(value = "categories/getAll")
    public Set<CategoryViewModel> getAll() {
        return categoryService.getAll();
    }

}