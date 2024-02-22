package com.fitpal.spring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rutinas_ejercicios")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Rutina_Ejercicios {

    @Id
    @Column(name = "idrutinasejercicios", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRutinasEjercicios;

    @Column(name = "idejercicios")
    private Integer idEjercicios;

    @Column(name = "idrutinass")
    private Integer idRutinass;
}
