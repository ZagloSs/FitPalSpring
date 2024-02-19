package com.fitpal.spring.services;

import com.fitpal.spring.models.Usuario;
import com.fitpal.spring.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAllUsers(){ return usuarioRepository.findAll();}

    public Usuario getUserById(Integer id){
        return usuarioRepository.findById(id).get();
    }

}
