package com.cjl.funitrack.entities;

import com.cjl.funitrack.enums.CargoType;
import com.cjl.funitrack.enums.RoleType;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "USERS")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private long id;

    private String nome;
    private String cpf;
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String senha;
    private String telefone;
    private String cep;
    private String logradouro;
    private String cidade;
    private String estado;
    private String bairro;
    private String numero;
    private String complemento;
    private String matricula;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name = "ROLE", referencedColumnName = "ID")
    private RoleType role;

    @Enumerated(EnumType.ORDINAL)
    @JoinColumn(name = "TIPO", referencedColumnName = "ID")
    private CargoType tipo;
}
