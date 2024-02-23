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

    @GetMapping("/all")//Encuentra todos los usuarios
    public List<Usuario> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping("/findbyid/{id}")//Encuentra al usuario por id
    public Usuario getProductById(@PathVariable Integer id){
        return service.getUserById(id);
    }

    @GetMapping("/findUserpass/{correo}")//Encuentra la contraseña de un usuario por el correo
    public Usuario getPassByEmail(@PathVariable String correo){
        return service.getPassWEmail(correo);
    }

    @PostMapping("/postUser")//Registra un usuario nuevo
    public Usuario addUser(@RequestBody Usuario usuario){
       return service.postUser(usuario);
    }

    @PutMapping("/updateUser")
    public Usuario updateUser(@RequestBody Usuario usuario){
        return service.updateUser(usuario);
    }

}
