package com.Rafaela.Senai.Fit.Service;

import org.springframework.stereotype.Service;

@Service
public class AtividadesService {
 public String verificarAtividade(int idade)
 {
	 if(idade>=14 && idade<=18) {
		 return "o máximo de 45 minutos de atividades por checkin, limitado a 135 minutos por semana;";
		 		
		 
	 }else if (idade>18 && idade<=60){
		 return " o máximo de 60 minutos de atividade por checkin, limitado a 420 minutos por semana;";
	 }else {
		 return ", o máximo de 30 minutos de atividade por checkin, limitado a 90 minutos por semana;";
	 }
 }
	
}
