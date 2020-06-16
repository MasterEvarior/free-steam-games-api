package com.giannin.freesteamgamesapi.repositories;

import com.giannin.freesteamgamesapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
    Optional<Category> findCategoryByIdAndDescription(Integer id, String description);
}
