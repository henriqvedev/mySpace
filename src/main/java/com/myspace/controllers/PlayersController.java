package com.myspace.controllers;


import com.myspace.repository.PlayersRepository;
import com.myspace.entities.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/players")
public class PlayersController {

    @Autowired
    private PlayersRepository playersRepository;

    @GetMapping
    public List<Players> findAll(){
        return playersRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Players findById(@PathVariable Long id){
        return playersRepository.findById(id).get();
    }

    @PostMapping
    public Players insert(@RequestBody Players players){
        return playersRepository.save(players);
    }
}
