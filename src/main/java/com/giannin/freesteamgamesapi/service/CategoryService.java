package com.giannin.freesteamgamesapi.service;

import com.giannin.freesteamgamesapi.model.Category;
import com.giannin.freesteamgamesapi.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public Category save(Category input){
        return this.repository.save(input);
    }

    public List<Category> getAll(){
        return this.repository.findAll();
    }

    public Optional<Category> getById(Integer id){
        return this.repository.findById(id);
    }

    public void delete(Integer id){
        this.repository.deleteById(id);
    }
}
