package com.Rafaela.Senai.Fit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rafaela.Senai.Fit.Dto.EstabelecimentoDto;
import com.Rafaela.Senai.Fit.Entidades.Endereco;
import com.Rafaela.Senai.Fit.Entidades.Estabelecimento;
import com.Rafaela.Senai.Fit.Repositorio.EnderecoRepository;
import com.Rafaela.Senai.Fit.Repositorio.EstabelecimentoRepository;
@Service
public class EstabelecimentoService {
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepo;
	@Autowired
	private EnderecoRepository enderecoRepo;

	public void SalvarEstabelecimento(EstabelecimentoDto estabelecimentoDto) {		
		var estabelecimento = new Estabelecimento();		
		var endereco = new Endereco();
		endereco.setApelido(estabelecimentoDto.getEndereco().getApelido());
		endereco.setCep(estabelecimentoDto.getEndereco().getCep());
		endereco.setEndereco(estabelecimentoDto.getEndereco().getEndereco());;		
	    enderecoRepo.save(endereco);
	    var id = endereco.getId();
		estabelecimento.setEnderecoId(id);
		estabelecimento.setNome(estabelecimentoDto.getNome());
		estabelecimentoRepo.save(estabelecimento);	
	
	}
	
	public List<Estabelecimento> ListEstabelecimento()
	{
		return estabelecimentoRepo.findAll();
	}
	
	
}
