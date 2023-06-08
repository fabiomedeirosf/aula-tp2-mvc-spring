package br.edu.fatec.aulamvc.model.business;

import java.util.List;

import br.edu.fatec.aulamvc.model.dto.Carro;

public interface CarroBusiness {

	public void cadastrarCarro(Carro carro);
	
	public List<Carro> obterCarros();
}
