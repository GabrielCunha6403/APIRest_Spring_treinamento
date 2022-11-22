package br.com.alura.forum.controller;

import br.com.alura.forum.controller.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    public List<TopicoDto> listarTopicos(){

        Topico topico = new Topico("Dúvida", "Dúvida arrasadora", new Curso("Ethical Hacking", "Vem ser hacker"));

        return TopicoDto.convert(Arrays.asList(topico, topico, topico));
    }

}
