package com.giannin.freesteamgamesapi.service;

import com.giannin.freesteamgamesapi.model.Game;
import com.giannin.freesteamgamesapi.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

    public List<Game> getAll(){
        return this.repository.findAll();
    }

    public List<String> getIdsOfAllGamesAsString(){
        List<Game> gameList = this.getAll();
        List<String> idList = new ArrayList<>();
        gameList.forEach(game ->
                idList.add(Integer.toString(game.getSteamId())
                ));
        return idList;
    }

    public void delete(Integer id){
        this.repository.deleteById(id);
    }
}
