package br.edu.fatec.aulamvc.model.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.edu.fatec.aulamvc.model.dto.Carro;

@Repository
public interface CarroRepository {

	public Carro salvar(Carro carro);
	
	public List<Carro> listar();
}
