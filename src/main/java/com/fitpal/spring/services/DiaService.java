package com.fitpal.spring.services;

import com.fitpal.spring.models.Dia;
import com.fitpal.spring.repositories.DiaRepositry;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DiaService {

    @Autowired
    private DiaRepositry repo;

    public List<Dia> getAllExerciseinDay(){
        return repo.findAll();
    }

    public Dia saveDia(Dia dia){
        return repo.save(dia);
    }



}
