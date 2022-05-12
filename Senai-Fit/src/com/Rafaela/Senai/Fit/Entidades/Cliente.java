package com.Rafaela.Senai.Fit.Entidades;
import javax.persistence.Entity;

@Entity
public class Cliente extends Pessoa {
	public Cliente() {
		super(TipoPessoa.USUARIO);
	}

}




