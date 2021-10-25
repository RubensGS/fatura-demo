package com.demo.services;

import com.demo.entities.req.Transacao;

import java.util.ArrayList;
import java.util.List;

public class TransacaoService {

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
