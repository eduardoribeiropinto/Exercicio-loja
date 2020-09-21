package controller;

import model.Endereco;
import view.EnderecoView;

public class EnderecoController {
	
	private Endereco model;
	private EnderecoView view;
	
	public EnderecoController (Endereco model, EnderecoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getEnderecoNumero() {
		return model.getNumero();
	}
	public String getEnderecoRua() {
		return model.getRua();
	}
	public String getEnderecoBairro() {
		return model.getBairro();
	}
	public String getEnderecoCidade() {
		return model.getCidade();
	}
	public String getEnderecoEstado() {
		return model.getEstado();
	}
	public String getEnderecoComplemento() {
		return model.getComplemento();
	}
	public int getEnderecoFkCliente() {
		return model.getFkCliente();
	}
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	
	public void setEnderecoNumero(int numero) {
		model.setNumero(numero);
	}
	public void setEnderecoRua(String rua) {
		model.setRua(rua);
	}
	public void setEnderecoBairro(String bairro) {
		model.setBairro(bairro);
	}
	public void setEnderecoCidade(String cidade) {
		model.setCidade(cidade);;
	}
	public void setEnderecoEstado(String estado) {
		model.setEstado(estado);
	}
	public void setEnderecoComplemento(String completo) {
		model.setComplemento(completo);
	}
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	public void updateView() {
		view.printEnderecoDetails(model.getNumero(), model.getRua(), model.getBairro(), model.getCidade(), model.getEstado(), model.getComplemento());
	}

}

