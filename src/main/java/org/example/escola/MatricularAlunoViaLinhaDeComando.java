package org.example.escola;

import org.example.escola.aplicacao.aluno.matricular.MatricularAluno;
import org.example.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import org.example.escola.dominio.aluno.RepositorioDeAlunos;
import org.example.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {

    public static void main(String[] args) {
        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria());

        matricularAluno.executa(
                new MatricularAlunoDTO(
                        "Fulano da Silva",
                        "123.456.789-00",
                        "fulano@email.com"
                )
        );
    }

}
