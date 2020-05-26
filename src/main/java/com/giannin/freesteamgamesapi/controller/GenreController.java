package com.giannin.freesteamgamesapi.controller;

import com.giannin.freesteamgamesapi.model.Genre;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreController {
    @GetMapping
    public List<Genre> getAllGenres(){
        throw new UnsupportedOperationException("Method is not yet supported");
    }

    @GetMapping("/{id}")
    public Genre getGenreById(@PathVariable Integer id){
        throw new UnsupportedOperationException("Method is not yet supported");
    }
}
