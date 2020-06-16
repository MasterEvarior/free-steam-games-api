package com.giannin.freesteamgamesapi.repositories;

import com.giannin.freesteamgamesapi.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
    Optional<Genre> findGenreByIdAndDescription(Integer id, String description);
}
