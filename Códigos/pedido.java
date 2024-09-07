package com.xsauniformes.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String prazo;
    
    @Lob
    private byte[] design;

    @OneToMany(mappedBy = "pedido")
    private List<Uniforme> uniformes;

    private Double valorTotal;

    // Getters e Setters
}
