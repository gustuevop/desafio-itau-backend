package br.com.itau.desafio.transacao.domain;

import java.time.OffsetDateTime;

public class Transacao {
	
	private Double valor;
	private OffsetDateTime dataHora;
	
	public Transacao(double valor, OffsetDateTime dataHora) {
		this.valor = valor;
		this.dataHora = dataHora;
	}
	
	public Double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public OffsetDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(OffsetDateTime dataHora) {
		this.dataHora = dataHora;
	}
}
