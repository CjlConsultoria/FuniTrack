package com.cjl.funitrack.enums;

public enum CargoType {
    ATENDENTE(1L, "ATENDENTE"),
    GERENCIA(2L, "GERENTE DE OFICINA"),
    FUNILEIRO(3L, "FUNILEIRO"),
    FINANCEIRO(4L, "FINANCEIRO"),
    CLIENTE(5L, "CLIENTE");

    private final Long id;
    private final String nome;

    CargoType(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public static CargoType fromId(Long id) {
        for (CargoType cargoType : values()) {
            if (cargoType.id.equals(id)) {
                return cargoType;
            }
        }
        return null;
    }
}
