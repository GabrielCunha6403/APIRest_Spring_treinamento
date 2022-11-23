package br.com.alura.forum.controller.form;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.CursoRepository;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TopicoForm {
    @Getter @Setter
    @NotNull @NotEmpty
    private String titulo;
    @Getter @Setter
    @NotNull @NotEmpty
    private String mensagem;
    @Getter @Setter
    @NotNull @NotEmpty
    private String nomeCurso;

    public Topico conveter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(this.titulo, this.mensagem, curso);
    }
}
