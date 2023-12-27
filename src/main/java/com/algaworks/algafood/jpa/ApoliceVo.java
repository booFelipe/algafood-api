package com.algaworks.algafood.jpa;

import java.io.Serializable;

public class ApoliceVo implements Serializable {
    private static final long serialVersionUID = 268612183093253697L;
    private String numeroApolice;

    public ApoliceVo(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }

    public String getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(String numeroApolice) {
        this.numeroApolice = numeroApolice;
    }
}
