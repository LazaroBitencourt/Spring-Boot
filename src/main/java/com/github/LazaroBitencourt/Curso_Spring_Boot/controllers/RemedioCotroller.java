package com.github.LazaroBitencourt.Curso_Spring_Boot.controllers;

import com.github.LazaroBitencourt.Curso_Spring_Boot.DTO.DadosCadastroRemedio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/remedios")
public class RemedioCotroller {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroRemedio dados) {

        System.out.println(dados);

    }
}
