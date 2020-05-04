package com.example.demo.repositories;

import com.example.demo.models.News;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends CrudRepository<News, Long> {
}
