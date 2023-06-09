package br.edu.fatec.aulamvc.model.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.edu.fatec.aulamvc.model.business.CarroBusiness;
import br.edu.fatec.aulamvc.model.dto.Carro;
import br.edu.fatec.aulamvc.model.repository.CarroRepository;

@Component
public class CarroBusinessImpl implements CarroBusiness {

	@Autowired
	private CarroRepository carroRepository;
	
	@Override
	public void cadastrarCarro(Carro carro) {
		
		this.carroRepository.salvar(carro);
		
	}

	@Override
	public List<Carro> obterCarros() {
		
		return this.carroRepository.listar();
	}

}
