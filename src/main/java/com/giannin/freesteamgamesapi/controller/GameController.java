package com.giannin.freesteamgamesapi.controller;

import com.giannin.freesteamgamesapi.model.Game;
import com.giannin.freesteamgamesapi.service.GameService;
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
@RequestMapping("/games")
public class GameController {
    @Autowired
    GameService service;


    @GetMapping
    public List<Game> getAllGames(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> getGameById(@PathVariable Integer id){
        Optional<Game> game = service.getById(id);
        if(game.isPresent()){
            return new ResponseEntity<>(game.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
