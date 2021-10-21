package com.demo.entities;

import java.time.Instant;

public class Transacoes {

	private Double valor;
	private String estabelecimento;
	private String tipo;
	private Instant data;
	
	public Transacoes() { }

	public Transacoes(Double valor, String estabelecimento, String tipo, Instant data) {
		this.valor = valor;
		this.estabelecimento = estabelecimento;
		this.tipo = tipo;
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Instant getData() {
		return data;
	}

	public void setData(Instant data) {
		this.data = data;
	}

	
	
	
}
