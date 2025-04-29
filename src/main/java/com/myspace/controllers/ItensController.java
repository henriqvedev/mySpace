package com.myspace.controllers;

import com.myspace.repository.ItensRepository;
import com.myspace.entities.ItensArmarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/itens")
public class ItensController {

    @Autowired
    public ItensRepository itensRepository;

    @GetMapping
    public List<ItensArmarios> findAll(){  //Listar todos Itens guardados
        return itensRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public ItensArmarios findById(@PathVariable Long id){
        return itensRepository.findById(id).get();
    }


    @PostMapping
    public ItensArmarios insert(@RequestBody ItensArmarios itensArmarios){ //Inserir Item
        return itensRepository.save(itensArmarios);
    }
}
