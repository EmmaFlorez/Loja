package com.shop.Loja.model;

public enum Cargo {

    AUXILIAR_DE_ESTOQUE("AUXILIAR_DE_ESTOQUE", 1, 1.450),
    VENDEDOR("VENDEDOR", 2, 1.850),
    GERENTE("GERENTE", 3, 3.000);

    private String descrição;
    private Integer codigo;
    private Double salario;

    public String getDescrição() { return descrição; }

    public Integer getCodigo() { return codigo; }

    public Double getSalario() { return salario; }

    Cargo(String descrição, Integer codigo, Double salario) {
        this.descrição = descrição;
        this.codigo = codigo;
        this.salario = salario;
    }
}
