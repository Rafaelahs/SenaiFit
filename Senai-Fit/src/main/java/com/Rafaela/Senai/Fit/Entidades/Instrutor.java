package com.Rafaela.Senai.Fit.Entidades;

import javax.persistence.Entity;

@Entity
public class Instrutor extends Pessoa {
	public Instrutor() {
		super(TipoPessoa.INSTRUTOR);
	}

}
