package model;

public class Telefone {
	
	private static int idTelefone;
	final private int fkCliente;
	
	private String ddd;
	private String numero;
	
	
	public Telefone(String ddd, String numero, Cliente cliente) {
		this.ddd = ddd;
		this.numero = numero;
//		this.cliente = cliente;
		this.fkCliente = cliente.getIdCliente();
	}
	
	public int getIdTelefone() {
		return idTelefone;
	}
	public int getFkCliente() {
		return fkCliente;
	}
	
	public String getDdd() {
		return ddd;
	}
	public String getNumero() {
		return numero;
	}
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------	
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
