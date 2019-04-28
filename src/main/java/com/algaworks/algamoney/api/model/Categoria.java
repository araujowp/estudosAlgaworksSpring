package com.algaworks.algamoney.api.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="categoria")
public class Categoria {
	
	private Long codigo;
	
	private String nome;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}