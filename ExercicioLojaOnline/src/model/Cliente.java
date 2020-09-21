package model;

import java.time.LocalDate;

public class Cliente {
	
	private static int idCliente;
	private LocalDate nascimento;
	private String nome;
	private String cpf;
	private String rg;
	private String email;
	
	public Cliente(String nome, LocalDate nascimento, String cpf, String rg, String email) {
		this.nascimento = nascimento;
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
	}
	public Cliente() {
		
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
	public String getEmail() {
		return email;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
}



