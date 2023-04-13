package br.edu.infnet.consulta.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

public class Paciente implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;
	private String sobrenome;
	private Date nascimento;
	private String mae;
	private String pai;
	private String sexo;
	private String cpf;
	private String convenio;
	private String email;
	private String telefone;
	
	public Paciente() {
	}

	public Paciente(String nome, String sobrenome, Date nascimento, String mae, String pai, String sexo, String cpf, String convenio, String email, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nascimento = nascimento;
		this.mae = mae;
		this.pai = pai;
		this.sexo = sexo;
		this.cpf = cpf;
		this.convenio = convenio;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getMae() {
		return mae;
	}

	public void setMae(String mae) {
		this.mae = mae;
	}

	public String getPai() {
		return pai;
	}

	public void setPai(String pai) {
		this.pai = pai;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
