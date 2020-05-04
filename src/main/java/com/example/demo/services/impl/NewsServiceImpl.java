package com.example.demo.services.impl;

import com.example.demo.models.News;
import com.example.demo.repositories.NewsRepository;
import com.example.demo.services.NewsService;
import com.example.demo.viewModels.NewsViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsRepository newsRepository;

    @Override
    public Boolean addNews(NewsViewModel newsViewModel) {
        News news = new News();
        news.setFrame(newsViewModel.getFrame());
        newsRepository.save(news);
        return true;
    }

    @Override
    public Set<NewsViewModel> getAll() {
        Set<NewsViewModel> newsViewModels = new HashSet<>();
        newsRepository.findAll().forEach(news -> {
            NewsViewModel newsViewModel = new NewsViewModel();
            newsViewModel.setFrame(news.getFrame());
            newsViewModels.add(newsViewModel);
        });
        return newsViewModels;
    }
}
