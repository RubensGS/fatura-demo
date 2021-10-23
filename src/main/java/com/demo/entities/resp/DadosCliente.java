package com.demo.entities.resp;

import com.demo.entities.req.Transacao;

import java.util.ArrayList;
import java.util.List;

public class DadosCliente {

    private String nomeCliente;
    private Double saldoAnterior;
    private Double totalFatura;
    private Double saldoDisponivel;

    private List<Transacao> transacoes = new ArrayList<>();

    public DadosCliente() {
    }

    public DadosCliente(String nomeCliente, Double saldoAnterior, Double totalFatura, Double saldoDisponivel, List<Transacao> transacoes) {
        this.nomeCliente = nomeCliente;
        this.saldoAnterior = saldoAnterior;
        this.totalFatura = totalFatura;
        this.saldoDisponivel = saldoDisponivel;
        this.transacoes = transacoes;
    }

    public DadosCliente(String nomeCliente, List<Transacao> transacoes) {
        this.nomeCliente = nomeCliente;
        this.saldoAnterior = getSaldoAnterior();
        this.totalFatura = getTotalFatura();
        this.saldoDisponivel = getSaldoDisponivel();
        this.transacoes = transacoes;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldoAnterior() {
        double sum = 0;
        for (Transacao item : transacoes) {
            if (item.getEstabelecimento().equals("Pagamento")) {
                sum += Math.abs(item.getValor());
            }
        }
        return saldoAnterior = sum;
    }

    public void setSaldoAnterior(Double saldoAnterior) { this.saldoAnterior = saldoAnterior; }

    public Double getTotalFatura() {
        double sum = 0;
        for (Transacao item : transacoes) {
            if (!item.getEstabelecimento().equals("Pagamento")) {
                sum += item.getValor();
            }
        }

        return totalFatura = sum;
    }

    public void setTotalFatura(Double totalFatura) { this.totalFatura = totalFatura; }

    public Double getSaldoDisponivel() {

        return getSaldoAnterior() - getTotalFatura();
    }

    public void setSaldoDisponivel(Double saldoDisponivel) {

        this.saldoDisponivel = saldoDisponivel;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
