package com.shop.Loja.controller;

import com.shop.Loja.model.Funcionario;
import com.shop.Loja.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Component
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/")
    public ResponseEntity<Optional<Funcionario>> buscarPorId (@RequestParam Integer id){
        return funcionarioService.buscarPorId(id);
    }

    @GetMapping
    public List<Funcionario> buscarTodos (){

        return funcionarioService.buscarTodos();
    }
//    @PostMapping
//    public ResponseEntity<Funcionario> salvar (){
//
//    }
//    @DeleteMapping
//    public ResponseEntity<Funcionario> deletar (){
//
//    }


}
