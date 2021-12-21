package com.shop.Loja.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "funcionario")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, length = 2)
    private Integer idade;

    @Column(nullable = false)
    private Cargo cargo;

    @Column(nullable = false)
    private Turno turno;

    public Funcionario(Funcionario  funcionario){
        this.id = funcionario.getId();
        this.nome = funcionario.getNome();
        this.idade = funcionario.getIdade();
        this.cargo = funcionario.getCargo();
        this.turno = funcionario.getTurno();
    }

}
