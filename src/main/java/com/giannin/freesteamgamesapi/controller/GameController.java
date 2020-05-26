package com.giannin.freesteamgamesapi.controller;

import com.giannin.freesteamgamesapi.model.Game;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @GetMapping
    public List<Game> getAllGames(){
        throw new UnsupportedOperationException("Method is not yet supported");
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable Integer id){
        throw new UnsupportedOperationException("Method is not yet supported");
    }
}
