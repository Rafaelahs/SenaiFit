
package com.Rafaela.Senai.Fit.Entidades;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@MappedSuperclass
public abstract class Pessoa  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;	
	@Column
	protected String nome;
	@Column
	protected String cpf;
	@Column
	protected int idade;
	@Column
	protected double altura;
	@Column
	protected double peso;
	@Column
	protected String sexo;
	@Column
	protected Date DataCadastro;
	@Column
	protected String IdEstabelecimento;
	
	public Pessoa(TipoPessoa tipo) {
		this.tipo = tipo;
	}


	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Column
	@Enumerated
	private TipoPessoa tipo;
	
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
	
	public TipoPessoa getTipo() {
		return tipo;
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
