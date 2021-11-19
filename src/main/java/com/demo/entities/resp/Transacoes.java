package com.demo.entities.resp;

import com.demo.entities.req.Transacao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Transacoes {

    private List<Transacao> internacionais = new ArrayList<>();
    private List<Transacao> nacionais = new ArrayList<>();

}
