package com.demo.payloads;

import com.demo.entities.req.Conta;
import com.demo.entities.req.Transacao;

import java.util.ArrayList;
import java.util.List;

public class RequestDAO {
     private Conta conta;
     private List<Transacao> transacoes = new ArrayList<>();

    public RequestDAO() { }

    public RequestDAO(Conta conta, List<Transacao> transacoes) {
        this.conta = conta;
        this.transacoes = transacoes;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

}
