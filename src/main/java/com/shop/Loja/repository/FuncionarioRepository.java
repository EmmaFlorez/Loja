package com.shop.Loja.repository;

import com.shop.Loja.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository <Funcionario, Integer> {

    Optional<Funcionario> findById (Integer id);

    Funcionario modelToResponse(Funcionario funcionario);
}
