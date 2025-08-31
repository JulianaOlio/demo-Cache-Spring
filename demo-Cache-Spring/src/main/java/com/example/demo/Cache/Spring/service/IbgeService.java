package com.example.demo.Cache.Spring.service;

import com.example.demo.Cache.Spring.cloud.Ibge;
import com.example.demo.Cache.Spring.cloud.IbgeResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class IbgeService {

    @Autowired
    private Ibge ibge;

    @Cacheable(value = "estados", condition = "#estado.equalsIgnoreCase('SP')")
    public List<IbgeResponse> findAllCidades(String estado) {
        log.info("vai buscar no IBGE");
        return ibge.findAllCidades(estado);
    }
}
