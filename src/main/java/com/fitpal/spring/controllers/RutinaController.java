package com.fitpal.spring.controllers;

import com.fitpal.spring.models.Rutina;
import com.fitpal.spring.services.RutinaService;
import com.fitpal.spring.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rutinas")
public class RutinaController {
    @Autowired
    private RutinaService service;

    @GetMapping("/all")
    public List<Rutina> getAllRutinas(){
        return service.getAllRutinas();
    }

}
