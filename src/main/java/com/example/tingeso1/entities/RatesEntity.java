package com.example.tingeso1.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tarifas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RatesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private String vueltasTiempo;
    private int precio;
    private int duracion;
}