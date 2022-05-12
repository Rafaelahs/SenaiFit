package com.Rafaela.Senai.Fit.Dto;


import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

import com.Rafaela.Senai.Fit.Entidades.Atividades;


public class CheckoutDto {
	@NotBlank
	protected String cpf;
	@NotBlank
	protected int idade;	
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public long getIdEstabelecimento() {
		return idEstabelecimento;
	}
	public void setIdEstabelecimento(long idEstabelecimento) {
		this.idEstabelecimento = idEstabelecimento;
	}
	@NotBlank
	protected int tempo;	
	@NotBlank
	protected long idEstabelecimento;	
	@Enumerated
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Atividades getAtividade() {
		return atividade;
	}
	public void setAtividade(Atividades atividade) {
		this.atividade = atividade;
	}
	@NotBlank
	@Enumerated
	protected Atividades atividade;

}
