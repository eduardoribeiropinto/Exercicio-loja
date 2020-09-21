package controller;

import java.time.LocalDate;
import model.Pedido;
import view.PedidoView;

public class PedidoController {
	
	private Pedido model;
	private PedidoView view;
	
	public PedidoController (Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public String getPedidoNfe() {
		return model.getNfe();
	}
	public LocalDate getPedidoDataEmissao() {
		return model.getDataEmissao();
	}
	public double getPedidoValorTotal() {
		return model.getValorTotal();
	}
	public String getPedidoStatusPedido() {
		return model.getStatusPedido();
	}
	public int getPedidoIdPedido() {
		return model.getIdPedido();
	}
	public int getPedidoFkCliente() {
		return model.getFkCliente();
	}
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	public void sePedidotNfe(String nfe) {
		model.setNfe(nfe);;
	}
	public void setPedidoDataEmissao(LocalDate dataEmissao) {
		model.setDataEmissao(dataEmissao);
	}
	public void setPedidoValorTotal(double valorTotal) {
		model.setValorTotal(valorTotal);
	}
	public void setPedidoStatusPedido(String statusPedido) {
		model.setStatusPedido(statusPedido);
	}
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	
	public void updateView() {
		view.printPedidoDetails(model.getNfe(), model.getDataEmissao(), model.getValorTotal(), model.getStatusPedido());
	}
}
