package model;

public class ProdutoPedido {
//	private Produto produto;
	final private int fkProduto;
	
//	private Pedido pedido;
	final private int fkPedido;
	
	private int quantidadeProduto;
	
	public ProdutoPedido(Produto produto, Pedido pedido, int quantidadeProduto) {
//		this.produto = produto;
		this.fkProduto = produto.getIdProduto();
//		this.pedido = pedido;
		this.fkPedido = pedido.getIdPedido();
		
		this.quantidadeProduto = quantidadeProduto;
	}
	
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public int getFkProduto() {
		return fkProduto;
	}
	public int getFkPedido() {
		return fkPedido;
	}
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
}
