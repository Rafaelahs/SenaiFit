package com.Rafaela.Senai.Fit.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Rafaela.Senai.Fit.Dto.EstabelecimentoDto;
import com.Rafaela.Senai.Fit.Dto.UsuarioDto;
import com.Rafaela.Senai.Fit.Service.EstabelecimentoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class EstabelecimentoController {
	@Autowired
	private EstabelecimentoService estabelecimentoService;
	
	@PostMapping("/estabelecimento/")
	public ResponseEntity salvaEstabelecimento(@Valid @RequestBody EstabelecimentoDto estabelecimentoDto) {
		this.estabelecimentoService.SalvarEstabelecimento(estabelecimentoDto);
		return new ResponseEntity<>(estabelecimentoDto, HttpStatus.CREATED);
	}

		
		@RequestMapping(value = "/list/estabelecimento", method = RequestMethod.GET)
		public ResponseEntity listUsuario() {
			var usuarios = this.estabelecimentoService.ListEstabelecimento();
			return new ResponseEntity<>(usuarios, HttpStatus.OK);
		}
		
	

}
