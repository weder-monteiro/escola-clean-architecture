package org.example.escola.aplicacao.aluno.matricular;

import org.example.escola.dominio.aluno.Aluno;
import org.example.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    //Design Patterns COMMAND
    public void executa(MatricularAlunoDTO dados) {
        Aluno novo = dados.criaAluno();

        repositorio.matricular(novo);
    }
}
