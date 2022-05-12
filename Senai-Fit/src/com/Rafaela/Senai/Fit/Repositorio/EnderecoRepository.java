package com.Rafaela.Senai.Fit.Repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rafaela.Senai.Fit.Entidades.Endereco;



@Repository
public interface EnderecoRepository  extends JpaRepository<Endereco, Long>{
	
	public Optional<Endereco> findById(Long id);
	}
