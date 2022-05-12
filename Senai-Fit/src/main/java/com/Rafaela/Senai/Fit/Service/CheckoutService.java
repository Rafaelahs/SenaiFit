package com.Rafaela.Senai.Fit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rafaela.Senai.Fit.Dto.CheckoutDto;
import com.Rafaela.Senai.Fit.Entidades.Checkout;
import com.Rafaela.Senai.Fit.Repositorio.CheckoutRepository;


@Service
public class CheckoutService {
	@Autowired
	private CheckoutRepository checkoutRepo;
	
	public void SalvarCheckout(CheckoutDto checkoutDto)
	{
		var checkout = new Checkout();
		checkout.setCpf(checkoutDto.getCpf());
		checkout.setIdade(checkoutDto.getIdade());
		checkout.setAtividade(checkoutDto.getAtividade());
		checkoutRepo.save(checkout);
	}
	

}
