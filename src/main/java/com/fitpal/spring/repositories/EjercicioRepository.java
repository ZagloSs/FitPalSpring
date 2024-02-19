package com.fitpal.spring.repositories;

import com.fitpal.spring.models.Ejercicio;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EjercicioRepository extends JpaRepository<Ejercicio, Integer> {
}
