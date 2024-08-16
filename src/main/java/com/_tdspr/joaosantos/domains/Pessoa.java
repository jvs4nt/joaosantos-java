package com._tdspr.joaosantos.domains;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String documento;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, String documento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
