package com.example.demo.services;

import com.example.demo.viewModels.NewsViewModel;

import java.util.Set;

public interface NewsService {
    Boolean addNews(NewsViewModel newsViewModel);
    Set<NewsViewModel> getAll();
}
