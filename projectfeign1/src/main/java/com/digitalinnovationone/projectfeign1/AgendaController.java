package com.digitalinnovationone.projectfeign1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("contato")
public class AgendaController {

    @GetMapping
    public Contato retornaContato(){
        return Contato.builder().id(1L).nome("Itallo").telefone("500-500-889").build();
    }
}
