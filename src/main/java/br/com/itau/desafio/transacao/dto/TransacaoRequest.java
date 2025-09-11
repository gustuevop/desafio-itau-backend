package br.com.itau.desafio.transacao.dto;

import java.time.OffsetDateTime;
import br.com.itau.desafio.transacao.domain.Transacao;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;

public class TransacaoRequest {
	
	@NotNull
	@PositiveOrZero
	private Double valor;
	
	@NotNull
	@PastOrPresent
	private OffsetDateTime dataHora;
	
	public double getValor() {
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
	
	public Transacao toTransacao() {
	    return new Transacao(valor, dataHora);
	}

}
