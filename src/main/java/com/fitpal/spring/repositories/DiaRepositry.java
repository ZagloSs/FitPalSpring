package com.fitpal.spring.repositories;

import com.fitpal.spring.models.Dia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiaRepositry extends JpaRepository<Dia, Integer> {
}
