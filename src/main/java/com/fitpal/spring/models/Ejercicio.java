package com.fitpal.spring.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ejercicio")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Ejercicio {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "grupo_muscular")
    private String gMuscular;

    @Column(name = "img")
    private String image64;
}
