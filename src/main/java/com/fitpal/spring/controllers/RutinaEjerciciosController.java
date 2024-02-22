package com.fitpal.spring.controllers;

import com.fitpal.spring.models.Rutina_Ejercicios;
import com.fitpal.spring.services.RutinaEjerciciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rutinas_ejercicios")
public class RutinaEjerciciosController {

    @Autowired
    private RutinaEjerciciosService service;

    @GetMapping("/getejerciciosfromrutina/{idrutina}")
    public List<Rutina_Ejercicios> getEjercicioFromRutina(@PathVariable int idrutina){
        return service.getRutinaEjerciciosByRutinaId(idrutina);
    }

    @GetMapping("/all")
    public List<Rutina_Ejercicios> getAllRutinasEjercicios(){
        return  service.getAllRutinaEjercicios();
    }

}
