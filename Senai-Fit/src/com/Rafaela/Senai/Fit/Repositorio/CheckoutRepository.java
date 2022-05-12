package com.Rafaela.Senai.Fit.Repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Rafaela.Senai.Fit.Entidades.Checkout;;

@Repository
public interface CheckoutRepository  extends JpaRepository<Checkout, Long>{	
	public Optional<Checkout> findById(Long id);
	public List<Checkout> findByCpf(String cpf);
	public List<Checkout> findByIdEstabelecimento(long IdEstabelecimento);
	
}

