package com.fitpal.spring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Entity
    @Table(name = "rutina")
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    @Builder
    public class Rutina {
        @Column(name = "id")
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "nombre")
        private String name;
}
