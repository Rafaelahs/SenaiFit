package com.Rafaela.Senai.Fit.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Rafaela.Senai.Fit.Dto.CheckoutDto;
import com.Rafaela.Senai.Fit.Dto.EstabelecimentoDto;
import com.Rafaela.Senai.Fit.Service.CheckoutService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class CheckoutController {
	@Autowired
	private CheckoutService checkoutService;
	
	@PostMapping("/checkout/")
	public ResponseEntity SalvarCheckout(@Valid @RequestBody CheckoutDto checkoutDto) {
		var resultado =this.checkoutService.SalvarCheckout(checkoutDto);
		return new ResponseEntity<>(resultado, HttpStatus.CREATED);
	}

		
		@RequestMapping(value = "/list/checkout", method = RequestMethod.GET)
		public ResponseEntity listCheckout() {
			var ckeckouts = this.checkoutService.ListCheckout();
			return new ResponseEntity<>(ckeckouts, HttpStatus.OK);
		}
		
		@RequestMapping(value = "/list/CheckoutEstabelecimento", method = RequestMethod.GET)
		public ResponseEntity listCheckoutIdEstabelecimento(long idEstabelecimento) {
			var ckeckouts = this.checkoutService.listCheckoutIdEstabelecimento(idEstabelecimento);
			return new ResponseEntity<>(ckeckouts, HttpStatus.OK);
		}
		@RequestMapping(value = "/list/CheckoutUsuario", method = RequestMethod.GET)
		public ResponseEntity listCheckoutCpf(String Cpf) {
			var ckeckouts = this.checkoutService.listCheckoutCpf(Cpf);
			return new ResponseEntity<>(ckeckouts, HttpStatus.OK);
		}
		
	
}
