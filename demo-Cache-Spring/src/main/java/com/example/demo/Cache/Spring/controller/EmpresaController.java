package com.example.demo.Cache.Spring.controller;

import com.example.demo.Cache.Spring.entity.Empresa;
import com.example.demo.Cache.Spring.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    @PostMapping
    public ResponseEntity<Empresa> create(@RequestBody Empresa novaEmpresa){
        Empresa criada = service.create(novaEmpresa);
        return ResponseEntity.status(HttpStatus.CREATED).body(criada);
    }

    @GetMapping
    public ResponseEntity<List<Empresa>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

}
