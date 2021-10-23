package com.demo.services;

import com.demo.entities.req.Transacao;
import com.demo.entities.resp.Transacoes;

import java.util.ArrayList;
import java.util.List;

public class TransacaoService {

    public List<Transacao> getListaInternacional(List<Transacao> list) {
        List<Transacao> aux = new ArrayList<>();

        for (Transacao transacao : list ) {
            if(transacao.getTipo().equals("Internacional")) {
                aux.add(transacao);
            }
        }
        return aux;
    }

    public List<Transacao> getListaNacional(List<Transacao> list) {
        List<Transacao> aux = new ArrayList<>();

        for (Transacao transacao : list ) {
            if(transacao.getTipo().equals("Nacional")) {
                aux.add(transacao);
            }
        }
        return aux;
    }



}
