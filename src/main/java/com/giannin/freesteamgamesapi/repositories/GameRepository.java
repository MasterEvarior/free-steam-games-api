package com.giannin.freesteamgamesapi.repositories;

import com.giannin.freesteamgamesapi.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
