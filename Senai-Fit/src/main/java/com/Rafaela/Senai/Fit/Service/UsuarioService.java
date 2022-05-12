package com.Rafaela.Senai.Fit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.Rafaela.Senai.Fit.Dto.UsuarioDto;
import com.Rafaela.Senai.Fit.Entidades.Cliente;
import com.Rafaela.Senai.Fit.Repositorio.UsuarioRepository;



@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepo;
	
	public boolean CadastroUsuario(UsuarioDto usuarioDto) {
		
		if(usuarioDto.getNome() == null) {
			return false;
		}
		
		Cliente usuario = new Cliente();		
		usuario.setCpf(usuarioDto.getCpf());
		usuario.setNome(usuarioDto.getNome());
		usuarioRepo.save(usuario);
		return true;
		
	}
	
	
	public List<Cliente> listUsuario(){	
		return usuarioRepo.findAll();
	}
	public Optional<Cliente> GetUsuarioCpf(String cpf) 
	{
		return usuarioRepo.findByCpf(cpf);
	}

}
