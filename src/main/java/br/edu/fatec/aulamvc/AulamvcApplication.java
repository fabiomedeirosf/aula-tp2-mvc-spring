package br.edu.fatec.aulamvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatec.aulamvc.model.dto.Carro;

@SpringBootApplication
@RestController
public class AulamvcApplication {

	public static void main(String... args) {
		
		SpringApplication.run(AulamvcApplication.class, args);
	}
	
	@RequestMapping("/hello")
	public String hello() {
		
		return "Hello";
	}
	
	@RequestMapping("/carros")
	public ResponseEntity<Carro> obterCarro() {
		
		Carro carro = new Carro();
		carro.setAno(2000);
		carro.setCodigo(10);
		carro.setMarca("fiat");
		carro.setModelo("uninho");
		
		return ResponseEntity.status(HttpStatus.OK).body(carro);
	}
	
	

}
