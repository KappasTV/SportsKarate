package com.example.demo.controllers;

import com.example.demo.services.GymService;
import com.example.demo.viewModels.GymViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin
@RestController
public class GymController {

    @Autowired
    GymService gymService;

    @PostMapping(value = "gyms/add")
    public Boolean addGym(@RequestBody GymViewModel gymViewModel) {
        return gymService.addGym(gymViewModel);
    }

    @GetMapping(value = "gyms/getAll")
    public Set<GymViewModel> getAll() {
        return gymService.getAll();
    }
}
