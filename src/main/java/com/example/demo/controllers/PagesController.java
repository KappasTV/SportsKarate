package com.example.demo.controllers;

import com.example.demo.services.DashboardService;
import com.example.demo.viewModels.AdminPageViewModel;
import com.example.demo.viewModels.LoginViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
public class PagesController {

    @Autowired
    DashboardService dashboardService;


    @PostMapping("/login")
    public boolean login(@RequestBody LoginViewModel loginViewModel) {
        return loginViewModel.getUsername().equals("admin") && loginViewModel.getPassword().equals("1234");
    }

    @GetMapping(value = "dashboard/get")
    public AdminPageViewModel getDashBoard() {
        return dashboardService.getDashboard();
    }

}
