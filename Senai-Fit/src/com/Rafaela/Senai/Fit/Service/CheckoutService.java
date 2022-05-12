package com.Rafaela.Senai.Fit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rafaela.Senai.Fit.Dto.CheckoutDto;
import com.Rafaela.Senai.Fit.Entidades.Atividades;
import com.Rafaela.Senai.Fit.Entidades.Checkout;
import com.Rafaela.Senai.Fit.Repositorio.CheckoutRepository;


@Service
public class CheckoutService {
	@Autowired
	private CheckoutRepository checkoutRepo;
	
	public String SalvarCheckout(CheckoutDto checkoutDto)
	{
		var resultado = "";
		var checkins = checkoutRepo.findByCpf(checkoutDto.getCpf());
		var total = checkins.size();		        
		var idade = checkoutDto.getIdade();
		var checkout = new Checkout();
		checkout.setCpf(checkoutDto.getCpf());
		checkout.setIdade(checkoutDto.getIdade());	
		checkout.setIdEstabelecimento(checkoutDto.getIdEstabelecimento());	
		if(idade>=18 && idade<=60)
		{
			checkout.setAtividade(Atividades.MINUTOS60);
			checkout.setTempo(60);
			resultado = "Para usuários entre 18 e 60 anos, o máximo de 60 minutos de atividade por checkin, limitado a 420 minutos por semana";
					
		}else if(idade>60) {
			checkout.setAtividade(Atividades.MINUTOS30);
			checkout.setTempo(30);
			resultado = "Para usuários acima de 60 anos, o máximo de 30 minutos de atividade por checkin, limitado a 90 minutos por semana";
					
		}
	    
		if(total >= 7)
		{
			resultado = "Cuidado! O excesso de atividade física também pode fazer mal para sua saúde!";
					
		}    
		checkoutRepo.save(checkout);
		return resultado;
		
		
	}
	
	public List<Checkout> ListCheckout()
	{
		return checkoutRepo.findAll();
	}
	public List<Checkout> listCheckoutIdEstabelecimento(long idEstabelecimento) {
		return checkoutRepo.findByIdEstabelecimento(idEstabelecimento);
	}
	public List<Checkout> listCheckoutCpf(String Cpf)
	{
		return checkoutRepo.findByCpf(Cpf);
	}
	
	

}
