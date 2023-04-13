package br.edu.infnet.consulta.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.consulta.entities.Consulta;

import br.edu.infnet.consulta.services.ConsultaService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value = "/consultas")
public class ConsultaResource {

	@Autowired
	private ConsultaService service;
	
	@HystrixCommand(fallbackMethod = "getConsultaAlternative")
	@GetMapping(value = "/{pacienteId}/{convenio}")
	public ResponseEntity<Consulta> getConsulta(@PathVariable Long pacienteId, @PathVariable String convenio) {
		Consulta consulta = service.getConsulta(pacienteId, convenio);
		return ResponseEntity.ok(consulta);
	}	
	
	public ResponseEntity<Consulta> getConsultaAlternative(Long pacienteId, String convenio) {
		Consulta consulta = new Consulta();
		return ResponseEntity.ok(consulta);
	}
}
