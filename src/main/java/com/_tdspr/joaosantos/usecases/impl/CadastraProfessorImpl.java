package com._tdspr.joaosantos.usecases.impl;

import com._tdspr.joaosantos.domains.Professor;
import com._tdspr.joaosantos.usecases.CadastraProfessor;

public class CadastraProfessorImpl implements CadastraProfessor {
    @Override
    public Professor executa(Professor professorParaSerCadastrado) {
        Professor cadastrado = new Professor();
        cadastrado.setNome(professorParaSerCadastrado.getNome());
        cadastrado.setSobrenome(professorParaSerCadastrado.getSobrenome());
        cadastrado.setDocumento(professorParaSerCadastrado.getDocumento());
        return cadastrado;
    }
}
