package com.Rafaela.Senai.Fit.Repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rafaela.Senai.Fit.Entidades.Estabelecimento;



@Repository
public interface EstabelecimentoRepository  extends JpaRepository<Estabelecimento, Long>{
	
	public Optional<Estabelecimento> findById(Long id);
	}
