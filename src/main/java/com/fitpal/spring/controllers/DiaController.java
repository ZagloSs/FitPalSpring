package com.fitpal.spring.controllers;


import com.fitpal.spring.models.Dia;
import com.fitpal.spring.services.DiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dias")
public class DiaController {
    @Autowired
    private DiaService service;

    @GetMapping("/all")
    public List<Dia> getAllExerciseDay(){
        return service.getAllExerciseinDay();
    }

    @GetMapping("/byid/{id}")
    public Dia getById(@PathVariable("id") int id){
        return service.getById(id);
    }

    @PostMapping("/saveDia")
    public Dia saveDia(@RequestBody Dia dia){
        return service.saveDia(dia);
    }
}
