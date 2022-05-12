package com.Rafaela.Senai.Fit.Dto;

import java.util.Date;

public class EstabelecimentoDto {
	
	protected Date dataCadastro;	
	private EnderecoDto endereco;
	
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public EnderecoDto getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoDto endereco) {
		this.endereco = endereco;
	}
}
