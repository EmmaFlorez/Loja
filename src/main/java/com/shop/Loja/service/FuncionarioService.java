package com.shop.Loja.service;

import com.shop.Loja.model.Funcionario;
import com.shop.Loja.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Autowired
    private Funcionario fun;

    public FuncionarioService (FuncionarioRepository funcionarioRepository)
    { this.funcionarioRepository = funcionarioRepository; }

    public ResponseEntity<Optional<Funcionario>> buscarPorId (Integer id){
        Optional<Funcionario> fun = funcionarioRepository.findById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(fun);

    }

    public List<Funcionario> buscarTodos (){
        List<Funcionario> funcionarioList = funcionarioRepository.findAll();
        List<Funcionario> funcionarios = new ArrayList<>();
        for (Funcionario funcionario : funcionarioList){
            Funcionario funcionario1 = funcionarioRepository.modelToResponse(funcionario);
            funcionarios.add(funcionario1);
        }
        return funcionarios;

    }
//
//    public ResponseEntity<Funcionario> salvar (){
//
//    }
//
//    public ResponseEntity<Funcionario> deletar (){
//
//    }
}
