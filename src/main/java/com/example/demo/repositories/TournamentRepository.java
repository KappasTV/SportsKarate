package com.example.demo.repositories;

import com.example.demo.models.Tournament;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentRepository extends CrudRepository<Tournament, Long> {
}
