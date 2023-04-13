package br.edu.infnet.consulta.entities;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;
	private String convenio;
	@Column(columnDefinition = "DATE")
	private LocalDate data;
	@Column(columnDefinition = "TIME")
	private LocalTime hora;

	public Consulta() {
	}

	public Consulta(String nome, String convenio, LocalDate data, LocalTime hora) {
		this.nome = nome;
		this.convenio = convenio;
		this.data = data;
		this.hora = hora;
	}

	public Consulta(String nome, String convenio) {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
}
