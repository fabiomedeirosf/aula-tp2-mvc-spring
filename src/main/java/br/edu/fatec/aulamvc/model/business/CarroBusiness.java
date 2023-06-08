package br.edu.fatec.aulamvc.model.business;

import java.util.List;

import org.springframework.stereotype.Component;

import br.edu.fatec.aulamvc.model.dto.Carro;

@Component
public interface CarroBusiness {

	public void cadastrarCarro(Carro carro);
	
	public List<Carro> obterCarros();
}
