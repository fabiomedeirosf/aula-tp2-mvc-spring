package br.edu.fatec.aulamvc.model.repository.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.fatec.aulamvc.model.dto.Carro;
import br.edu.fatec.aulamvc.model.repository.CarroRepository;

public class CarroRepositoryImpl implements CarroRepository {

	private static List<Carro> bdCarros = new ArrayList<Carro>();
			
	@Override
	public Carro salvar(Carro carro) {
		Integer id = (int) (Math.random() * 1000);
		carro.setCodigo(id);
		
		bdCarros.add(carro);
		return carro;
	}

	@Override
	public List<Carro> listar() {
		
		return bdCarros;
	}

}
