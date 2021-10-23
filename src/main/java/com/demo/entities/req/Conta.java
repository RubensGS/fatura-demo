package com.demo.entities.req;

public class Conta {
	
	private String nomeCliente;
	private Double limite;

	public Conta() { }

	public Conta(String nomeCliente, Double limite) {
		this.nomeCliente = nomeCliente;
		this.limite = limite;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "Conta{" +
				"nomeCliente='" + nomeCliente + '\'' +
				", limite=" + limite +
				'}';
	}
}
