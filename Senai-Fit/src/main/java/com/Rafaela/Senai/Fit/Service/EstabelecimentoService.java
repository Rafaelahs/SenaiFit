package com.Rafaela.Senai.Fit.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rafaela.Senai.Fit.Dto.EstabelecimentoDto;
import com.Rafaela.Senai.Fit.Entidades.Endereco;
import com.Rafaela.Senai.Fit.Entidades.Estabelecimento;
import com.Rafaela.Senai.Fit.Repositorio.EstabelecimentoRepository;
@Service
public class EstabelecimentoService {
	@Autowired
	private EstabelecimentoRepository estabelecimentoRepo;

	public void SalvarEstabelecimento(EstabelecimentoDto estabelecimentoDto) {
		List<Endereco> list = new ArrayList<Endereco>();
		var estabelecimento = new Estabelecimento();
		estabelecimento.setDataCadastro(estabelecimentoDto.getDataCadastro());
		var endereco = new Endereco();
		endereco.setApelido(estabelecimentoDto.getEndereco().getApelido());
		endereco.setCep(estabelecimentoDto.getEndereco().getCep());
		endereco.setEndereco(estabelecimentoDto.getEndereco().getEndereco());;
		list.add(endereco);
		estabelecimento.setEnderecoId(1);
		estabelecimentoRepo.save(estabelecimento);
	}
	
	
}
