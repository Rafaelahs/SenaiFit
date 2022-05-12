package com.Rafaela.Senai.Fit.Entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Estabelecimento  {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	protected Date dataCadastro;	
	
	@Column
	private long enderecoId;

	public Long getId() {
		return id;
	}

	
	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public long getEnderecoId() {
		return enderecoId;
	}


	public void setEnderecoId(long enderecoId) {
		this.enderecoId = enderecoId;
	}


	
	
}
