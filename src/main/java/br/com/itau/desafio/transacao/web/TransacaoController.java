package br.com.itau.desafio.transacao.web;

import br.com.itau.desafio.transacao.domain.Transacao;
import br.com.itau.desafio.transacao.dto.TransacaoRequest;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


@RestController
public class TransacaoController {

	private final List<Transacao> transacoes = new CopyOnWriteArrayList<Transacao>();
	
	@PostMapping("/transacao")
	public ResponseEntity<Void> criar(@RequestBody @Valid TransacaoRequest request) {
		
		Transacao transacao = request.toTransacao();
		transacoes.add(transacao);
		
		return ResponseEntity.status(201).build();
	}
	
}
