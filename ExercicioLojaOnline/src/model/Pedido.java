package model;

import java.time.LocalDate;

public class Pedido {
	
	private static int idPedido;
	final private int fkCliente; 
	
	private String nfe;
	private LocalDate dataEmissao;
	private double valorTotal;
	private String statusPedido;
	
	
	public Pedido(String nfe, LocalDate dataEmissao, double valorTotal, String statusPedido,
			Cliente cliente) {
		this.nfe = nfe;
		this.dataEmissao = dataEmissao;
		this.valorTotal = valorTotal;
		this.statusPedido = statusPedido;
		this.fkCliente = cliente.getIdCliente();
	}
	public int getIdPedido() {
		return idPedido;
	}
	public int getFkCliente() {
		return fkCliente;
	}

	public String getNfe() {
		return nfe;
	}
	public LocalDate getDataEmissao() {
		return dataEmissao;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public String getStatusPedido() {
		return statusPedido;
	}
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------	
	
	public void setNfe(String nfe) {
		this.nfe = nfe;
	}
	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}
}
