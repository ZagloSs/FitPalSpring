package com.fitpal.spring.controllers;


import com.fitpal.spring.models.Usuario;
import com.fitpal.spring.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @GetMapping("/all")
    public List<Usuario> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping("/findbyid/{id}")
    public Usuario getProductById(@PathVariable Integer id){
        return service.getUserById(id);
    }

    @GetMapping("/findUserpass/{correo}")
    public String getPassByEmail(@PathVariable String correo){
        return service.getPassWEmail(correo);
    }

    @PostMapping("/postUser")
    public void addUser(@RequestBody Usuario usuario){
        service.postUser(usuario);
    }

}
