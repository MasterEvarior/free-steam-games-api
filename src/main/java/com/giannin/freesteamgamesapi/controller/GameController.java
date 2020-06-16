package com.giannin.freesteamgamesapi.controller;

import com.giannin.freesteamgamesapi.model.Game;
import com.giannin.freesteamgamesapi.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    GameService service;


    @GetMapping
    public List<Game> getAllGames(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable Integer id){
        throw new UnsupportedOperationException("Method is not yet supported");
    }
}
