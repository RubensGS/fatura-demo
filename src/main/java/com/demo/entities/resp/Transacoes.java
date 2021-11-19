package com.demo.entities.resp;

import com.demo.entities.req.Transacao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor @Setter @AllArgsConstructor @Getter
public class Transacoes {

    private List<Transacao> internacionais = new ArrayList<>();
    private List<Transacao> nacionais = new ArrayList<>();

    public Transacoes(List<Transacao> list) {
        this.internacionais = getListaInternacional(list);
        this.nacionais = getListaNacional(list);
    }

    public List<Transacao> getListaInternacional(List<Transacao> list) {
        List<Transacao> aux = new ArrayList<>();
        for (Transacao transacao : list ) {
            if(transacao.getTipo().equals("Internacional")) {
                transacao.setTipo("");
                aux.add(transacao);
            }
        }
        return aux;
    }

    public List<Transacao> getListaNacional(List<Transacao> list) {
        List<Transacao> aux = new ArrayList<>();

        for (Transacao transacao : list ) {
            if(transacao.getTipo().equals("Nacional")) {
                transacao.setTipo("");
                aux.add(transacao);
            }
        }
        return aux;
    }
}
