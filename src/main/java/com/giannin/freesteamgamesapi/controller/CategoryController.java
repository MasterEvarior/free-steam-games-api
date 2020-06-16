package com.giannin.freesteamgamesapi.controller;

import com.giannin.freesteamgamesapi.model.Category;
import com.giannin.freesteamgamesapi.model.Genre;
import com.giannin.freesteamgamesapi.service.CategoryService;
import com.giannin.freesteamgamesapi.service.GenreService;
import com.sun.tools.javah.Gen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryService service;

    @GetMapping
    public List<Category> getAllCategories(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Integer id){
        Optional<Category> category = service.getById(id);
        if(category.isPresent()){
            return new ResponseEntity<Category>(category.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
