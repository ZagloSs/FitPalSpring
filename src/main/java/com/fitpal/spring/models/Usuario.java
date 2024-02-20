package com.fitpal.spring.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Usuario {

    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name ="nombre")
    private String nombreUsuario;

    @Column(name="altura")
    private float alturaUsuario;

    @Column(name="peso_actual")
    private float pesoUsuario;

    @Column(name = "genero")
    private String generoUsuario;

    @Column(name = "rutina_actual")
    private Integer rutinaActual;

    @Column(name = "apellido")
    private String apellidoUsuario;

    @Column(name = "correo")
    private String correo;

    @Column(name = "contraseña")
    private String contraseña;
}
