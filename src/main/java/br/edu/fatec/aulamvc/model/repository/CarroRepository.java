package br.edu.fatec.aulamvc.model.repository;

import java.util.List;

import br.edu.fatec.aulamvc.model.dto.Carro;

public interface CarroRepository {

	public Carro salvar(Carro carro);
	
	public List<Carro> listar();
}
