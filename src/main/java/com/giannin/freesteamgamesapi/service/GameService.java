package com.giannin.freesteamgamesapi.service;

import com.giannin.freesteamgamesapi.model.Game;
import com.giannin.freesteamgamesapi.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameService {
    @Autowired
    private GameRepository repository;

    public Game save(Game input){
        return this.repository.save(input);
    }

    public Optional<Game> getById(Integer id){
        return this.repository.findById(id);
    }

    public void delete(Integer id){
        this.repository.deleteById(id);
    }
}
