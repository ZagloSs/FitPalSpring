package com.fitpal.spring.controllers;

import com.fitpal.spring.models.Ejercicio;
import com.fitpal.spring.models.Usuario;
import com.fitpal.spring.services.EjercicioService;
import com.fitpal.spring.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ejercicio")
public class EjercicioController {

    @Autowired
    private EjercicioService service;

    @GetMapping("/all")
    public List<Ejercicio> getAllEx(){
        return service.getAllEx();
    }
}
