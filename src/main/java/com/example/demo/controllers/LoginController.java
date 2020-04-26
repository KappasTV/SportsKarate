package com.example.demo.controllers;


import com.example.demo.viewModels.LoginViewModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @PostMapping("/login")
    public boolean login(@RequestBody LoginViewModel loginViewModel) {
        return loginViewModel.getUsername().equals("admin") && loginViewModel.getPassword().equals("1234");
    }
}
