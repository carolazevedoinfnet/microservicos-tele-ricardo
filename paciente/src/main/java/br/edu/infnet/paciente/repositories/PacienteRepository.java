package br.edu.infnet.paciente.repositories;

import br.edu.infnet.paciente.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
