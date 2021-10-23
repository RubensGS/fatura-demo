package com.demo.entities.resp;

public class Fatura {
    private DadosCliente dadosCliente;
    private Transacoes transacoes;
    private Total totais;

    public Fatura() {  }

    public Fatura(DadosCliente dadosCliente, Transacoes transacoes, Total totais) {
        this.dadosCliente = dadosCliente;
        this.transacoes = transacoes;
        this.totais = totais;
    }

    public DadosCliente getDadosCliente() {
        return dadosCliente;
    }

    public void setDadosCliente(DadosCliente dadosCliente) {
        this.dadosCliente = dadosCliente;
    }

    public Transacoes getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(Transacoes transacoes) {
        this.transacoes = transacoes;
    }

    public Total getTotais() {
        return totais;
    }

    public void setTotais(Total totais) {
        this.totais = totais;
    }

}
