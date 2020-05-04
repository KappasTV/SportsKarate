package com.example.demo.controllers;

import com.example.demo.services.NewsService;
import com.example.demo.viewModels.NewsViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Set;

@CrossOrigin
@RestController
public class NewsController {
    @Autowired
    NewsService newsService;

    @PostMapping(value = "news/add")
    public Boolean addGym(@RequestBody NewsViewModel newsViewModel) {
        return newsService.addNews(newsViewModel);
    }

    @GetMapping(value = "news/getAll")
    public Set<NewsViewModel> getAll() {
        return newsService.getAll();
    }
}
