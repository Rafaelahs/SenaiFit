package com.Rafaela.Senai.Fit.Dto;

import javax.validation.constraints.NotBlank;


public class EnderecoDto {
	@NotBlank
	private String endereco;	
	@NotBlank
	private String cep;
	@NotBlank
	private String apelido;
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	
}
