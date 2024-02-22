package com.fitpal.spring.services;


import com.fitpal.spring.controllers.RutinaController;
import com.fitpal.spring.models.Rutina;
import com.fitpal.spring.models.Rutina_Ejercicios;
import com.fitpal.spring.repositories.RutinaEjerciciosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RutinaEjerciciosService {

    @Autowired
    private RutinaEjerciciosRepository repo;

    public List<Rutina_Ejercicios> getAllRutinaEjercicios(){
        return repo.findAll();
    }

    public List<Rutina_Ejercicios> getRutinaEjerciciosByRutinaId(int idRutina){
        return repo.getEjerciciosByRutinas(idRutina);
    }
}
