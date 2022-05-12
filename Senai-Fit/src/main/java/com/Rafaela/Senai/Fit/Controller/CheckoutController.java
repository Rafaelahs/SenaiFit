package com.Rafaela.Senai.Fit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.Rafaela.Senai.Fit.Service.CheckoutService;
import com.Rafaela.Senai.Fit.Service.UsuarioService;

@RestController
public class CheckoutController {
	@Autowired
	private CheckoutService checkoutService;
}
