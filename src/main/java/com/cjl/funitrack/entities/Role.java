package com.cjl.funitrack.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ROLE")
@Getter
@Setter
public class Role {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

}
