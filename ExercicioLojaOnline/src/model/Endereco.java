package model;

public class Endereco {
	
	private static int idEndereco;
	final private int fkCliente;
	
	private int numero;
	private String rua;
	private String bairro;
	private String cidade;
	private String estado;
	private String complemento;
	
//	private Cliente cliente;
	
	
	public Endereco(int numero, String rua, String bairro, String cidade, String estado, String complemento,
			Cliente cliente) {
		this.numero = numero;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.complemento = complemento;
//		this.cliente = cliente;
		this.fkCliente = cliente.getIdCliente();
	}
	
	public int getIdEndereco() {
		return idEndereco;
	}
	public int getFkCliente() {
		return fkCliente;
	}
	
	public int getNumero() {
		return numero;
	}
	public String getRua() {
		return rua;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}
	public String getComplemento() {
		return complemento;
	}

	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setComplemento(String completo) {
		this.complemento = completo;
	}
}
