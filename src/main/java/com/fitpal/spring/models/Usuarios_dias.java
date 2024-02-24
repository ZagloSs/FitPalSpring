package com.fitpal.spring.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios_dias")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Usuarios_dias {


    @Column(name = "idusuariosdias")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarios_dias;

    @Column(name = "iddia")
    private int idDia;

    @Column(name = "idusuario")
    private int idUsuario;


}
