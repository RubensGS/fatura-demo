package com.demo.payloads;

import com.demo.entities.req.Conta;
import com.demo.entities.req.Transacao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class RequestDAO {
     private Conta conta;
     private List<Transacao> transacoes = new ArrayList<>();
}
