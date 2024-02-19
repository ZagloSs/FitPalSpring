package com.fitpal.spring.services;


import com.fitpal.spring.models.DiaGym;
import com.fitpal.spring.repositories.DiaGymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaGymService {

    @Autowired
    private DiaGymRepository repository;

    public List<DiaGym> getAllDays(){
        return repository.findAll();
    }
}
