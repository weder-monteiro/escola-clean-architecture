package org.example.escola.dominio.aluno;

public class FabricaDeAluno {

    private Aluno aluno;

    public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));

        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero) {
        this.aluno.adicionaTelefone(ddd, numero);

        return this;
    }

    public Aluno cria() {
        return this.aluno;
    }

}
