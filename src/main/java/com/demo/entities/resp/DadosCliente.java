package com.demo.entities.resp;

public class DadosCliente {

    private String nomeCliente;
    private Double saldoAnterior;
    private Double totalFatura;
    private Double saldoDisponivel;

    public DadosCliente() { }

    public DadosCliente(String nomeCliente, Double saldoAnterior, Double totalFatura, Double saldoDisponivel) {
        this.nomeCliente = nomeCliente;
        this.saldoAnterior = saldoAnterior;
        this.totalFatura = totalFatura;
        this.saldoDisponivel = saldoDisponivel;
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
        this.saldoAnterior = saldoAnterior;
    }

    public Double getTotalFatura() {
        return totalFatura;
    }

    public void setTotalFatura(Double totalFatura) {
        this.totalFatura = totalFatura;
    }

    public Double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public void setSaldoDisponivel(Double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }
}
