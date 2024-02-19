package com.fitpal.spring.services;

import com.fitpal.spring.models.Ejercicio;
import com.fitpal.spring.repositories.EjercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EjercicioService {
    @Autowired
    private EjercicioRepository repo;

    public List<Ejercicio> getAllEx(){
        return repo.findAll();
    }
}
