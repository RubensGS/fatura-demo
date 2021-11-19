package com.demo.entities.resp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Fatura {
    private DadosCliente dadosCliente;
    private Transacoes transacoes;
    private Total totais;
}
