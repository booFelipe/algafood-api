package com.algaworks.algafood.jpa;

import java.util.Date;
import java.util.List;

public class CartaoSeguradoVO {
    private Date validade;
    private List<ApoliceVo> apolices;

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public List<ApoliceVo> getApolices() {
        return apolices;
    }

    public void setApolices(List<ApoliceVo> apolices) {
        this.apolices = apolices;
    }
}
