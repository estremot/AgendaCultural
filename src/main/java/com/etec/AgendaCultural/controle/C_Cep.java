package com.etec.AgendaCultural.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etec.AgendaCultural.model.Cep;
import com.etec.AgendaCultural.repository.R_Cep;

import jakarta.transaction.Transactional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/agenda/ceps")
public class C_Cep {
	@Autowired
	private R_Cep repositoryCep;

	@GetMapping
	public List<Cep> lista() //DTO - Data Transfer Object
	{
			List<Cep> ceps = repositoryCep.findAll();
			return ceps;
	}
	
		
			
	@GetMapping("/{id}")
	public Cep retornaCepId(@PathVariable Long id) {
		Cep cep = repositoryCep.getOne(id);
		return cep;
	}
	
	@DeleteMapping("/{id}")
	public String deletaId(@PathVariable Long id) {
		
		repositoryCep.deleteById(id);
		return "Campo deletado com id = "+id;
	}
	
	@PostMapping()
	public String salvarDados(@RequestBody Cep cep) {
		
		repositoryCep.save(cep);
		return "Dados do Usuário salvos com sucesso!!";
	}
	
	@PutMapping("/{id}")
	@Transactional
	public String atualizaDados(@PathVariable Long id, @RequestBody Cep cep) {
		
		 cep.setCodcep(id);
		 repositoryCep.save(cep);

		return "Dados Atualizados";
	}

}

