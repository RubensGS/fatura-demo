package com.demo.entities.req;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Transacao {

    private Double valor;
    private String estabelecimento;
    private String tipo;
    private LocalDateTime data;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Transacao() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transacao transacao = (Transacao) o;
        return tipo.equals(transacao.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo);
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "valor=" + valor +
                ", estabelecimento='" + estabelecimento + '\'' +
                ", tipo='" + tipo + '\'' +
                ", data=" + data.format(formatter) +
                '}';
    }
}
