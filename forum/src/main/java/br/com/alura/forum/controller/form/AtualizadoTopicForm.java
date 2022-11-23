package br.com.alura.forum.controller.form;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AtualizadoTopicForm {
    @NotNull @NotEmpty
    @Getter @Setter
    private String titulo;
    @NotNull @NotEmpty
    @Getter @Setter
    private String mensagem;

    public Topico atualizar(Long id, TopicoRepository repository){
        Topico topico = repository.getReferenceById(id);
        topico.setTitulo(this.getTitulo());
        topico.setMensagem(this.getMensagem());

        return topico;
    }
}
