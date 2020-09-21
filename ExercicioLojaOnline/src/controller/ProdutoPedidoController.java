package controller;

import model.ProdutoPedido;
import view.ProdutoPedidoView;

public class ProdutoPedidoController {
	
	private ProdutoPedido model;
	private ProdutoPedidoView view;
	
	public ProdutoPedidoController(ProdutoPedido model, ProdutoPedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getProdutoPedidoQuantidadeProduto() {
		return model.getQuantidadeProduto();
	}
	public int getProdutoPedidoFkProduto() {
		return model.getFkProduto();
	}
	public int getProdutoPedidoFkPedido() {
		return model.getFkPedido();
	}
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	public void setProdutoPedidoQuantidadeProduto(int quantidadeProduto) {
		model.setQuantidadeProduto(quantidadeProduto);
	}
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	public void updadeView() {
		view.printPedidoDetails(model.getFkPedido(), model.getFkProduto(), model.getQuantidadeProduto());
	}
}