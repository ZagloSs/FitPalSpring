package com.fitpal.spring.services;


import com.fitpal.spring.models.Rutina;
import com.fitpal.spring.repositories.RutinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RutinaService {
    @Autowired
    private RutinaRepository repo;

    public List<Rutina> getAllRutinas(){
        return repo.findAll();
    }
}
