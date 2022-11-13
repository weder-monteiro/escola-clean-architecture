package org.example.escola.aplicacao.aluno.matricular;

import org.example.escola.dominio.aluno.Aluno;
import org.example.escola.dominio.aluno.CPF;
import org.example.escola.dominio.aluno.Email;

public class MatricularAlunoDTO {

    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDTO(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criaAluno() {
        return new Aluno(new CPF(this.cpfAluno), nomeAluno, new Email(this.emailAluno));
    }
}
