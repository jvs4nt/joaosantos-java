package com._tdspr.joaosantos.usecases.impl;

import com._tdspr.joaosantos.domains.Aluno;
import com._tdspr.joaosantos.usecases.CadastraAluno;

public class CadastraAlunoImpl  implements CadastraAluno {
    @Override
    public Aluno executa(Aluno alunoParaSerCadastrado) {
        Aluno cadastrado = new Aluno();
        cadastrado.setNome(alunoParaSerCadastrado.getNome());
        cadastrado.setSobrenome(alunoParaSerCadastrado.getSobrenome());
        cadastrado.setDocumento(alunoParaSerCadastrado.getDocumento());
        return cadastrado;
    }
}
