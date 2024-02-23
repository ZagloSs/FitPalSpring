package com.fitpal.spring.controllers;


import com.fitpal.spring.models.Dia;
import com.fitpal.spring.services.DiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ejerciciosDia")
public class DiaController {
    @Autowired
    private DiaService service;

    @GetMapping("/all")
    public List<Dia> getAllExerciseDay(){
        return service.getAllExerciseinDay();
    }
}
