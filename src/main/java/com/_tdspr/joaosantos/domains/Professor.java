package com._tdspr.joaosantos.domains;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor() {
    }

    public Professor(String nome, String sobrenome, String documento, String disciplina) {
        super(nome, sobrenome, documento);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

}
