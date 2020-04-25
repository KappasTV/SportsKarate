package com.example.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("tournament")
public class TournamentController {

    @GetMapping
    public String g() {
        return "";
    }

}
