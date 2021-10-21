package com.demo.entities.req;

import java.time.LocalDateTime;

public class Transacao {

    private Double valor;
    private String estabelecimento;
    private String tipo;
    private LocalDateTime data;

    public Transacao() {}

    public Transacao(Double valor, String estabelecimento, String tipo, LocalDateTime data) {
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.tipo = tipo;
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
