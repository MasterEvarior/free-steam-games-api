package com.giannin.freesteamgamesapi.repositories;

import com.giannin.freesteamgamesapi.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
