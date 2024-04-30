package com.example.cp2java.controller;


import com.example.cp2java.domain.Brinquedos;
import com.example.cp2java.repository.BrinquedosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedosController {
    @Autowired
    private BrinquedosRepository Repository;

    //Retorna todos os brinquedos
    @GetMapping
    public ResponseEntity getBrinquedos(){
        var TodosBrinquedos = Repository.findAll();
        return ResponseEntity.ok(TodosBrinquedos);
    }

    //Retorna um brinquedo pelo id
    @GetMapping("/{id}")
    public ResponseEntity getBrinquedosById(@PathVariable int id) {
        Optional<Brinquedos> brinquedoEncontrado = Repository.findById(id);

        if (brinquedoEncontrado.isPresent()) {
            Brinquedos brinquedo = brinquedoEncontrado.get();
            return ResponseEntity.ok(brinquedo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //Cria um novo brinquedo
    @PostMapping
    public Brinquedos createBrinquedos(@RequestBody Brinquedos dadosBrinquedos){
        return Repository.save(dadosBrinquedos);
    }

}
