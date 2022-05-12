
package com.Rafaela.Senai.Fit.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Rafaela.Senai.Fit.Dto.UsuarioDto;
import com.Rafaela.Senai.Fit.Service.UsuarioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping(value = "/Usuario", method = RequestMethod.POST)
	public ResponseEntity salvaCliente(@Valid @RequestBody UsuarioDto usuario) {
		this.usuarioService.CadastroUsuario(usuario);
		return new ResponseEntity<>(usuario, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/list/usuario", method = RequestMethod.GET)
	public ResponseEntity listUsuario() {
		var usuarios = this.usuarioService.listUsuario();
		return new ResponseEntity<>(usuarios, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/usuarioCpf/", method = RequestMethod.GET)
	public ResponseEntity GetUsuarioCpf(String cpf) {
		var usuario = this.usuarioService.GetUsuarioCpf(cpf);
		return new ResponseEntity<>(usuario, HttpStatus.OK);
	}
}
