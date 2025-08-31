package com.example.demo.Cache.Spring.service;

import com.example.demo.Cache.Spring.entity.Empresa;
import com.example.demo.Cache.Spring.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository repository;

    public Empresa create(Empresa novaEmpresa){
        if(repository.existsByName(novaEmpresa.getName())){
            throw new IllegalArgumentException("Já existe uma empresa com esse nome.");
        }
        return repository.save(novaEmpresa);
    }

    @Cacheable("empresas")
    public List<Empresa> findAllComCache() {
        return (List<Empresa>) repository.findAll();
    }

    public List<Empresa> findAll() {
        return (List<Empresa>) repository.findAll();
    }
}
