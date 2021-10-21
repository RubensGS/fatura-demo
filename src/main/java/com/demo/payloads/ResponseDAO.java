package com.demo.payloads;

import com.demo.entities.resp.Fatura;

public class ResponseDAO {

    private Fatura fatura;

    public ResponseDAO() { }

    public ResponseDAO(Fatura fatura) {
        this.fatura = fatura;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
}
