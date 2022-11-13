package org.example.escola.infra.aluno;

import org.example.escola.dominio.aluno.Aluno;
import org.example.escola.dominio.aluno.CPF;
import org.example.escola.dominio.aluno.RepositorioDeAlunos;
import org.example.escola.dominio.aluno.Telefone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RepositorioDeAlunosComJDBC implements RepositorioDeAlunos {

    private final Connection connection;

    public RepositorioDeAlunosComJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        try {
            String sql = "INSERT INTO ALUNO VALUES(?, ?, ?)";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, aluno.getCpf());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getEmail());

            ps.execute();

            sql = "INSERT INTO TELEFONE VALUES(?, ?)";

            ps = connection.prepareStatement(sql);

            for(Telefone telefone : aluno.getTelefones()) {
                ps.setString(1, telefone.getDdd());
                ps.setString(2, telefone.getNumero());

                ps.execute();
            }

        }catch(SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return null;
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return null;
    }

}
