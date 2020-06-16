package com.giannin.freesteamgamesapi.controller;

import com.giannin.freesteamgamesapi.model.Genre;
import com.giannin.freesteamgamesapi.service.GenreService;
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
@RequestMapping("/genres")
public class GenreController {
    @Autowired
    GenreService service;

    @GetMapping
    public List<Genre> getAllCategories(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genre> getCategoryById(@PathVariable Integer id){
        Optional<Genre> genre = service.getById(id);
        if(genre.isPresent()){
            return new ResponseEntity<Genre>(genre.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
