package com.fitpal.spring.controllers;


import com.fitpal.spring.models.Usuarios_dias;
import com.fitpal.spring.services.Usuario_diasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario_dias")
public class UsuariosDiasController {

    @Autowired
    private Usuario_diasService service;

    @GetMapping("/all")
    public List<Usuarios_dias> getAll(){
        return service.getAllDias();
    }

    @GetMapping("/userid/{id}")
    public List<Usuarios_dias> byUserid(@PathVariable int id){
        return service.getDiasByUserId(id);
    }

    @PostMapping("/save")
    public Usuarios_dias saveDay(@RequestBody Usuarios_dias usuariosDias){
        return service.saveDias(usuariosDias);
    }



}
