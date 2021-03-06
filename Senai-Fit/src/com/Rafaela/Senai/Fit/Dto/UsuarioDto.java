package com.Rafaela.Senai.Fit.Dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UsuarioDto  {
	@NotBlank
	protected String nome;
	@NotEmpty
	@Size(min = 11, max = 11)
	protected String cpf;
	protected int idade;
	protected double altura;
	protected double peso;
	@NotEmpty
	protected Date DataCadastro;
	protected String IdEstabelecimento;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
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
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Date getDataCadastro() {
		return DataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		DataCadastro = dataCadastro;
	}
	public String getIdEstabelecimento() {
		return IdEstabelecimento;
	}
	public void setIdEstabelecimento(String idEstabelecimento) {
		IdEstabelecimento = idEstabelecimento;
	}
	
	
	
	

}
