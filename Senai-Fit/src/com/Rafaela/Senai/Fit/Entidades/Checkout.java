package com.Rafaela.Senai.Fit.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Checkout {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	@Column
	protected int tempo;
	@Column	
	protected String cpf;
	@Column
	protected int idade;
	@Column
	protected long idEstabelecimento;
	@Column
	@Enumerated
	protected Atividades atividade;
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
	
	
	

}
