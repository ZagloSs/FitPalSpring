package com.fitpal.spring.repositories;

import com.fitpal.spring.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query(value ="SELECT contraseña FROM usuario WHERE correo = ?1", nativeQuery = true)
    String getPassWEmail(String email);



}
