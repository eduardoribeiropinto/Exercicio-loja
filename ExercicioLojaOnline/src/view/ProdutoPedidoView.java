package view;

public class ProdutoPedidoView {
	
	public void printPedidoDetails (int fk_pedido, int fk_produto, int quantidade_produto) {
		System.out.println("Produto Pedido: ");
		System.out.println("Pedido: " + fk_pedido);
		System.out.println("Produto: " + fk_produto);
		System.out.println("Quantidade produto: " + quantidade_produto + "\n");	
	}
	
}
