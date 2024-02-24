package com.fitpal.spring.repositories;

import com.fitpal.spring.models.Usuarios_dias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioDiaRepository extends JpaRepository<Usuarios_dias, Integer> {

    @Query(value = "SELECT * FROM usuarios_dias WHERE idUsuario = ?1", nativeQuery = true)
    List<Usuarios_dias> getDaysByUserId(int id);
}
