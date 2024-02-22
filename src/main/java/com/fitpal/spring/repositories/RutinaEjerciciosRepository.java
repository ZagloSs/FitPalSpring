package com.fitpal.spring.repositories;

import com.fitpal.spring.models.Rutina_Ejercicios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RutinaEjerciciosRepository extends JpaRepository<Rutina_Ejercicios, Integer> {
    @Query(value = "SELECT * FROM rutinas_ejercicios WHERE idrutinass = ?1",nativeQuery = true)
    List<Rutina_Ejercicios> getEjerciciosByRutinas(Integer idRutina);
}
