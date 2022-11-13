package org.example.escola.aplicacao.aluno.matricular;

import org.example.escola.dominio.aluno.Aluno;
import org.example.escola.dominio.aluno.CPF;
import org.example.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        //Poderia ser MOCK usando Mockito
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);
        MatricularAlunoDTO dados = new MatricularAlunoDTO(
            "Fulano",
            "123.456.789-00",
            "fulano@email.com"
        );
        useCase.executa(dados);
        Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));

        assertEquals("Fulano", encontrado.getNome());
        assertEquals("123.456.789-00", encontrado.getCpf());
        assertEquals("fulano@email.com", encontrado.getEmail());
    }

}