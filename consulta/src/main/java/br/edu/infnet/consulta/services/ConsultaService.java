package br.edu.infnet.consulta.services;

import br.edu.infnet.consulta.entities.Consulta;
import br.edu.infnet.consulta.entities.Paciente;
import br.edu.infnet.consulta.feignclients.PacienteFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {
	
	@Autowired
	private PacienteFeignClient pacienteFeignClient;

	public Consulta getConsulta(long pacienteId, String convenio) {
				
		Paciente paciente = pacienteFeignClient.findById(pacienteId).getBody();
		return new Consulta(paciente.getNome(), paciente.getConvenio());
	}
}
