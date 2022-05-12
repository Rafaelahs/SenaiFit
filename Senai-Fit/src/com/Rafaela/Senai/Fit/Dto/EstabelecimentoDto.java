package com.Rafaela.Senai.Fit.Dto;

public class EstabelecimentoDto {
	
	
	private EnderecoDto endereco;
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public EnderecoDto getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoDto endereco) {
		this.endereco = endereco;
	}
}
