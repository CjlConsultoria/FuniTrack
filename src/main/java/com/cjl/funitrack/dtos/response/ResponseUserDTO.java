package com.cjl.funitrack.dtos.response;

import com.cjl.funitrack.enums.CargoType;
import com.cjl.funitrack.enums.RoleType;
import lombok.Data;

@Data
public class ResponseUserDTO {

    private String nome;
    private String cpf;
    private String email;
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
