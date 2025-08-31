package com.example.demo.Cache.Spring.repository;

import com.example.demo.Cache.Spring.entity.Empresa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {

    boolean existsByName(String name);
}
