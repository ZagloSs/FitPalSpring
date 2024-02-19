package com.fitpal.spring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dia_gym")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DiaGym {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fecha_asistencia")
    private String fechaAsistencia;

    @Column(name = "peso_del_dia")
    private float PesoDia;

}
