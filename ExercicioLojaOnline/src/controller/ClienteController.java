package controller;


import java.time.LocalDate;

import model.Cliente;
import view.ClienteView;

public class ClienteController {
	
	private Cliente model;
	private ClienteView view;
	
	public ClienteController(Cliente model, ClienteView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getClienteIdCliente() {
		return model.getIdCliente();
	}
	public String getClienteNome() {
		return model.getNome();
	}
	public String getClienteCpf() {
		return model.getCpf();
	}
	public String getClienteRg() {
		return model.getRg();
	}
	public String getClienteEmail() {
		return model.getEmail();
	}
	public LocalDate getClienteNascimento() {
		return model.getNascimento();
	}
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------	
	
	public void setClienteNome(String nome) {
		model.setNome(nome);
	}
	public void setClienteCpf(String cpf) {
		model.setCpf(cpf);
	}
	public void setClienteRg(String rg) {
		model.setRg(rg);
	}
	public void setClienteEmail(String email) {
		model.setEmail(email);
	}
	public void setClienteNascimento(LocalDate nascimento) {
		model.setNascimento(nascimento);
	}
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	public void updateView() {
		view.printClienteDetails (model.getIdCliente(), model.getNome(), model.getNascimento(), model.getCpf(), model.getRg(), model.getEmail());
	}
}



