package com.fitpal.spring.services;


import com.fitpal.spring.models.Dia;
import com.fitpal.spring.models.Usuarios_dias;
import com.fitpal.spring.repositories.UsuarioDiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Usuario_diasService {

    @Autowired
    private UsuarioDiaRepository repo;

    public Usuarios_dias saveDias(Usuarios_dias usuariosDias){
        return repo.save(usuariosDias);
    }

    public List<Usuarios_dias> getDiasByUserId(int id){
        return repo.getDaysByUserId(id);
    }

    public List<Usuarios_dias> getAllDias(){
        return repo.findAll();
    }

}
