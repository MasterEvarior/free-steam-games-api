package com.giannin.freesteamgamesapi.service;

import com.giannin.freesteamgamesapi.model.Genre;
import com.giannin.freesteamgamesapi.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreService {
    @Autowired
    private GenreRepository repository;

    public Genre save(Genre input){
        return repository.save(input);
    }

    public List<Genre> getAll(){
        return repository.findAll();
    }

    public Optional<Genre> getById(Integer id){
        return repository.findById(id);
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}
