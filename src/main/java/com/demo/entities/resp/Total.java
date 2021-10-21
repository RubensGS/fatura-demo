package com.demo.entities.resp;

public class Total {

    private Double totalDebitos;
    private Double totalCreditos;

    public Total() { }

    public Total(Double totalDebitos, Double totalCreditos) {
        this.totalDebitos = totalDebitos;
        this.totalCreditos = totalCreditos;
    }

    public Double getTotalDebitos() {
        return totalDebitos;
    }

    public void setTotalDebitos(Double totalDebitos) {
        this.totalDebitos = totalDebitos;
    }

    public Double getTotalCreditos() {
        return totalCreditos;
    }

    public void setTotalCreditos(Double totalCreditos) {
        this.totalCreditos = totalCreditos;
    }
}
