package com.demo.entities.resp;

import com.demo.entities.req.Transacao;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor @AllArgsConstructor @Setter
public class DadosCliente {

    private String nomeCliente;
    private Double saldoAnterior;
    private Double totalFatura;
    private Double saldoDisponivel;
    private List<Transacao> transacoes = new ArrayList<>();

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

    public Double getSaldoAnterior() {
        double sum = 0;
        for (Transacao item : transacoes) {
            if (item.getEstabelecimento().equals("Pagamento")) {
                sum += Math.abs(item.getValor());
            }
        }
        return saldoAnterior = sum;
    }

    public Double getTotalFatura() {
        double sum = 0;
        for (Transacao item : transacoes) {
            if (!item.getEstabelecimento().equals("Pagamento")) {
                sum += item.getValor();
            }
        }

        return totalFatura = sum;
    }

    public Double getSaldoDisponivel() {

        return getSaldoAnterior() - getTotalFatura();
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}
