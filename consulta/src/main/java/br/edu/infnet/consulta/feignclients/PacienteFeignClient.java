package br.edu.infnet.consulta.feignclients;

import br.edu.infnet.consulta.entities.Paciente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "paciente", path = "/pacientes")
public interface PacienteFeignClient {

	@GetMapping(value = "/{id}")
	ResponseEntity<Paciente> findById(@PathVariable Long id);
}
