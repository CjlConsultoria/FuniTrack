package com.cjl.funitrack.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TIPO")
@Getter
@Setter
public class Tipo {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    public Tipo () {

    }

    public Tipo(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
