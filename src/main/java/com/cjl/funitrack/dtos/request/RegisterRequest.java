package com.cjl.funitrack.dtos.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank(message = "Preenchimento obrigatório!")
    private String nome;

    @NotBlank(message = "Preenchimento obrigatório!")
    private String cpf;

    @NotBlank(message = "Preenchimento obrigatório!")
    private String email;

    @NotBlank(message = "Preenchimento obrigatório!")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String senha;

    @NotBlank(message = "Preenchimento obrigatório!")
    private String telefone;

    @NotBlank(message = "Preenchimento obrigatório!")
    private String cep;

    @NotBlank(message = "Preenchimento obrigatório!")
    private String logradouro;

    @NotBlank(message = "Preenchimento obrigatório!")
    private String cidade;

    @NotBlank(message = "Preenchimento obrigatório!")
    private String estado;

    @NotBlank(message = "Preenchimento obrigatório!")
    private String bairro;

    @NotBlank(message = "Preenchimento obrigatório!")
    private String numero;

    private String complemento;

    @NotBlank(message = "Preenchimento obrigatório!")
    private String matricula;

    @NotNull(message = "Seleção obrigatória!")
    private Long role;

    @NotNull(message = "Seleção obrigatória!")
    private Long tipo;
}
