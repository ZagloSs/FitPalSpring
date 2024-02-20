package com.fitpal.spring.repositories;

import com.fitpal.spring.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query("SELECT contraseña FROM Usuario WHERE correo = ?1")
    String getPassWEmail(String email);



}
