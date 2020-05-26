package com.giannin.freesteamgamesapi.repositories;

import com.giannin.freesteamgamesapi.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
