package br.edu.infnet.paciente.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.paciente.entities.Paciente;
import br.edu.infnet.paciente.repositories.PacienteRepository;

@RefreshScope
@RestController
@RequestMapping(value = "/pacientes")
public class PacienteResource {
	
	private static Logger logger = LoggerFactory.getLogger(PacienteResource.class);
	
	//@Value("${test.config}")
	//private String testConfig;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private PacienteRepository repository;
	
	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfigs() {
		//logger.info("CONFIG = " + testConfig);
		return ResponseEntity.noContent().build();
	}		
	
	@GetMapping
	public ResponseEntity<List<Paciente>> findAll() {
		List<Paciente> list = repository.findAll();
		return ResponseEntity.ok(list);
	}	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Paciente> findById(@PathVariable Long id) {
		
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		logger.info("PORT = " + env.getProperty("local.server.port"));
		
		Paciente obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}	
}
