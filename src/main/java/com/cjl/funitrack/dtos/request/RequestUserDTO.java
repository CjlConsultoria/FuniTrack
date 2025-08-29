package com.cjl.funitrack.dtos.request;

import com.cjl.funitrack.entities.Role;
import com.cjl.funitrack.entities.Tipo;
import com.cjl.funitrack.enums.CargoType;
import com.cjl.funitrack.enums.RoleType;
import lombok.Data;

@Data
public class RequestUserDTO {

    private String nome;
    private String cpf;
    private String email;
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
    private RoleType role;
    private CargoType tipo;
}
