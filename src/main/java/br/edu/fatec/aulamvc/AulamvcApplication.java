package br.edu.fatec.aulamvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatec.aulamvc.model.business.CarroBusiness;
import br.edu.fatec.aulamvc.model.dto.Carro;

@SpringBootApplication
@RestController
public class AulamvcApplication {

	@Autowired
	private CarroBusiness carroBusiness;
	
	public static void main(String... args) {
		
		SpringApplication.run(AulamvcApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String hello() {
		
		return "Hello";
	}
	
	@RequestMapping("/carros")
	public ResponseEntity<List<Carro>> obterCarro() {
		
		Carro carro = new Carro();
		carro.setAno(2000);
		carro.setMarca("fiat");
		carro.setModelo("uninho");
		
		carroBusiness.cadastrarCarro(carro);
		
		List<Carro> listaCarros = this.carroBusiness.obterCarros();
		
		return ResponseEntity.status(HttpStatus.OK).body(listaCarros);
	}
	
	

}
