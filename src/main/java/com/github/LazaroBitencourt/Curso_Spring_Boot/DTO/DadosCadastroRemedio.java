package com.github.LazaroBitencourt.Curso_Spring_Boot.DTO;

import com.github.LazaroBitencourt.Curso_Spring_Boot.controllers.Labotatorio;
import com.github.LazaroBitencourt.Curso_Spring_Boot.controllers.Via;

public record DadosCadastroRemedio(
        String nome,
       Via via,
       int quantidade,
       String validade,
       Labotatorio laboratorio) {
}
