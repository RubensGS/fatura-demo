package com.demo.entities.resp;

import com.demo.entities.req.Transacao;

import java.util.ArrayList;
import java.util.List;

public class Transacoes {

    private List<Transacao> internacionais = new ArrayList<>();
    private List<Transacao> nacionais = new ArrayList<>();

    public Transacoes() {  }

    public Transacoes(List<Transacao> internacionais, List<Transacao> nacionais) {
        this.internacionais = internacionais;
        this.nacionais = nacionais;
    }

    public List<Transacao> getInternacionais() {
        return internacionais;
    }

    public void setInternacionais(List<Transacao> internacionais) {
        this.internacionais = internacionais;
    }

    public List<Transacao> getNacionais() {
        return nacionais;
    }

    public void setNacionais(List<Transacao> nacionais) {
        this.nacionais = nacionais;
    }
}
