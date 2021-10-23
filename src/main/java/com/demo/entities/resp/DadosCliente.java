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

    public DadosCliente() { }

    public DadosCliente(String nomeCliente, Double saldoAnterior, Double totalFatura, Double saldoDisponivel, List<Transacao> transacoes) {
        this.nomeCliente = nomeCliente;
        this.saldoAnterior = saldoAnterior;
        this.totalFatura = totalFatura;
        this.saldoDisponivel = saldoDisponivel;
        this.transacoes = transacoes;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(Double saldoAnterior) {
        double sum = 0;
        for (Transacao item : transacoes) {
            if(item.getEstabelecimento().equals("Pagamento")) {
                sum += Math.abs(item.getValor());
            }
        }
        this.saldoAnterior = sum;
    }

    public Double getTotalFatura() {
        return totalFatura;
    }

    public void setTotalFatura(Double totalFatura) {
        double sum = 0;
        for (Transacao item : transacoes) {
            if(!item.getEstabelecimento().equals("Pagamento")) {
                sum += item.getValor();
            }
        }
        this.totalFatura = sum;

    }

    public Double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(Double saldoDisponivel) {

        this.saldoDisponivel = getSaldoAnterior() - getTotalFatura();
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
