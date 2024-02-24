package com.fitpal.spring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "dia")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Dia {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "time")
    private String time;

    @Column(name = "date")
    private String date;

    @Column(name = "month")
    private String month;

    @Column(name = "year")
    private String year;

}
