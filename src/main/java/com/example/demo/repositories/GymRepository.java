package com.example.demo.repositories;

import com.example.demo.models.Gym;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymRepository extends CrudRepository<Gym, Long> {
}
