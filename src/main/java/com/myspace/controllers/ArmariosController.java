package com.myspace.controllers;

import com.myspace.repository.ArmariosRepository;
import com.myspace.entities.Armarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/armarios")
public class ArmariosController {

    @Autowired
    private ArmariosRepository armariosRepository;

    @GetMapping
    public List<Armarios> findAll(){
        return armariosRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Armarios findById(@PathVariable Long id){
        return armariosRepository.findById(id).get();

    }

    @PostMapping
    public Armarios insert (@RequestBody Armarios armarios){
        return armariosRepository.save(armarios);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Void> deleteArmario(@PathVariable Long id){
        armariosRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
