package com.algaworks.algamoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.algaworks.algamoney.api.model.Lancamento;
import com.algaworks.algamoney.api.repository.LancamentoRepository;

@Service
public class LancamentoService {

	@Autowired
	LancamentoRepository lancamentoRepository; 
	
	private Lancamento buscaLancamentoPorId(Long codigo) {
		
		Lancamento lancamentoEncontrado  = lancamentoRepository.findOne(codigo);
		
		if (lancamentoEncontrado == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		return lancamentoEncontrado ; 
		
	}
	
}
