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

import com.etec.AgendaCultural.model.Datacomemorativa;
import com.etec.AgendaCultural.repository.R_Datacomemorativa;

import jakarta.transaction.Transactional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/agenda/datascomemorativas")
public class C_Datacomemorativa {
	@Autowired
	private R_Datacomemorativa repositoryDatacomemorativa;

	@GetMapping
	public List<Datacomemorativa> lista() //DTO - Data Transfer Object
	{
			List<Datacomemorativa> datascomemorativas = repositoryDatacomemorativa.findAll();
			return datascomemorativas;
	}
	
		
			
	@GetMapping("/{id}")
	public Datacomemorativa retornaDatacomemorativaId(@PathVariable Long id) {
		Datacomemorativa datacomemorativa = repositoryDatacomemorativa.getOne(id);
		return datacomemorativa;
	}
	
	@DeleteMapping("/{id}")
	public String deletaId(@PathVariable Long id) {
		
		repositoryDatacomemorativa.deleteById(id);
		return "Campo deletado com id = "+id;
	}
	
	@PostMapping()
	public String salvarDados(@RequestBody Datacomemorativa datacomemorativa) {
		
		repositoryDatacomemorativa.save(datacomemorativa);
		return "Dados do Usuário salvos com sucesso!!";
	}
	
	@PutMapping("/{id}")
	@Transactional
	public String atualizaDados(@PathVariable Long id, @RequestBody Datacomemorativa datacomemorativa) {
		
		 datacomemorativa.setCoddatacomemorativa(id);
		 repositoryDatacomemorativa.save(datacomemorativa);

		return "Dados Atualizados";
	}

}