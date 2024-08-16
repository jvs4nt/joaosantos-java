package com._tdspr.joaosantos.usecases.impl;

import com._tdspr.joaosantos.domains.Aluno;
import com._tdspr.joaosantos.usecases.CadastraAluno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CadastraAlunoImplTest {

    CadastraAluno cadastrarAluno = new CadastraAlunoImpl();

    @Test
    @DisplayName("Testa se as infos do objeto aluno ser cadastrado forem devidamente copiadas para o objeto novo")
    void testExecutaDeCadastrarDeAluno() {
      // Dado uma condicao
      Aluno AlunoParaSerCadastrado = new Aluno();
      AlunoParaSerCadastrado.setNome("Gustavo");
      AlunoParaSerCadastrado.setSobrenome("Rabelo");
      AlunoParaSerCadastrado.setDocumento("12345678900");

      // Quando algo acontecer, Act, Actual
      Aluno cadastrado = cadastrarAluno.executa(AlunoParaSerCadastrado);
      // Entao verifique um determinado info, ASSERT
      Assertions.assertEquals(AlunoParaSerCadastrado.getNome(), cadastrado.getNome(), "O nome do aluno cadastrado deve ser igual ao nome do aluno para ser cadastrado");
      Assertions.assertEquals(AlunoParaSerCadastrado.getSobrenome(), cadastrado.getSobrenome(), "O sobrenome do aluno cadastrado deve ser igual ao sobrenome do aluno para ser cadastrado");
        Assertions.assertEquals(AlunoParaSerCadastrado.getDocumento(), cadastrado.getDocumento(), "O documento do aluno cadastrado deve ser igual ao documento do aluno para ser cadastrado");
    }


}
