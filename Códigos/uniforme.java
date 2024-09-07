package com.xsauniformes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Uniforme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tamanho;
    private String cor;
    private String material;
    private String tipo;
    private int quantidade;

    // Getters e Setters
}