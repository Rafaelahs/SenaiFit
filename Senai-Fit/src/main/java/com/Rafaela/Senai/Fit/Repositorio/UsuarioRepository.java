package com.Rafaela.Senai.Fit.Repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Rafaela.Senai.Fit.Entidades.Cliente;


@Repository
public interface UsuarioRepository  extends JpaRepository<Cliente, Long>{
	
	public Optional<Cliente> findById(Long id);
	public Optional<Cliente> findByCpf(String cpf);

}
