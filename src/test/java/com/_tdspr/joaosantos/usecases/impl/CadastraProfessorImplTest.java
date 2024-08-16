package com._tdspr.joaosantos.usecases.impl;

import com._tdspr.joaosantos.domains.Professor;
import com._tdspr.joaosantos.usecases.CadastraProfessor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadastraProfessorImplTest {

    CadastraProfessor cadastrarProfessor = new CadastraProfessorImpl();

    @Test
    @DisplayName("Deve cadastrar um professor")
    void testExecutaDeCadastrarDeProfessor() {
        // Dado uma condicao
        Professor professorParaSerCadastrado = new Professor();
        professorParaSerCadastrado.setNome("João");
        professorParaSerCadastrado.setSobrenome("Luis");
        professorParaSerCadastrado.setDocumento("298903842");

        // Quando algo acontecer, Act, Actual
        Professor cadastrado = cadastrarProfessor.executa(professorParaSerCadastrado);
        // Entao verifique um determinado info, ASSERT
        assertEquals(professorParaSerCadastrado.getNome(), cadastrado.getNome(), "O nome do professor cadastrado deve ser igual ao nome do professor para ser cadastrado");
        assertEquals(professorParaSerCadastrado.getSobrenome(), cadastrado.getSobrenome(), "O sobrenome do professor cadastrado deve ser igual ao sobrenome do professor para ser cadastrado");
        assertEquals(professorParaSerCadastrado.getDocumento(), cadastrado.getDocumento(), "O documento do professor cadastrado deve ser igual ao documento do professor para ser cadastrado");
    }

}
