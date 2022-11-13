package org.example.escola.infra.indicacao;

import org.example.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import org.example.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicado) {
        //logica de envio de email com a lib java mail
    }

}
