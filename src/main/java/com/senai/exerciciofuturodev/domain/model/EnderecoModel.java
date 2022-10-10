package com.senai.exerciciofuturodev.domain.model;

public class EnderecoModel {
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    private String cep;
    private String cidade;
}
