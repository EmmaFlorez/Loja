package com.shop.Loja.model;

public enum Turno {

    MANHA("TURNO_MANHA", 1, "8:00 - 12:30"),
    TARDE("TURNO_TARDE", 2, "12:30 - 18:00" ),
    NOITE("TURNO_NOITE", 3, "18:00 - 22:00");

    private String descricao;
    private Integer codigo;
    private String horario;

    public String getDescricao() {
        return descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getHorario() {
        return horario;
    }

    Turno(String descricao, Integer codigo, String horario) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.horario = horario;
    }
}
