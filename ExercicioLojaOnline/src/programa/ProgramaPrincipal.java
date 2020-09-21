package programa;

import java.time.LocalDate;

// Cliente
import controller.ClienteController;
import model.Cliente;
import view.ClienteView;

// Endereço
import controller.EnderecoController;
import controller.PedidoController;
import controller.ProdutoController;
import controller.ProdutoPedidoController;
import controller.TelefoneController;
import model.Endereco;
import model.Pedido;
import model.Produto;
import model.ProdutoPedido;
import model.Telefone;
import view.EnderecoView;
import view.PedidoView;
import view.ProdutoPedidoView;
import view.ProdutoView;
import view.TelefoneView;

public class ProgramaPrincipal {
	public static void main(String[] args) {
//		Cliente
		LocalDate data = LocalDate.of(1989, 12, 06);
		Cliente model = new Cliente("Eduardo Ribeiro Pinto",data,"46.343.252-6","46.343.252-6","eduardo.pinto@unesp.br");
		ClienteView view = new ClienteView();
		ClienteController controller = new ClienteController(model, view);
		
		controller.updateView();	
		
		
//		Endereço
		Endereco endModel = new Endereco(2130,"Santos Dumont", "Brabancia","Avaré","SP","casa",model);
		EnderecoView endView = new EnderecoView();
		EnderecoController endController = new EnderecoController(endModel, endView);
		
		endController.updateView();
		
//		Telefone
		Telefone telModel = new Telefone("14","99658-1529",model);
		TelefoneView telView = new TelefoneView();
		TelefoneController telController = new TelefoneController(telModel,telView);
		
		telController.updateView();
		
		
//		Produto	
		Produto prodModel = new Produto("Celular","Xiaomi",1500.00);
		ProdutoView prodView = new ProdutoView();
		ProdutoController prodController = new ProdutoController(prodModel,prodView);
		
		prodController.updateView();
		
//		Pedido

		Pedido pedidoModel = new Pedido("000000000-0",data,1500.00,"Aprovado",model);
		PedidoView pedidoView = new PedidoView();
		PedidoController pedidoController = new PedidoController(pedidoModel,pedidoView);
		
		pedidoController.updateView();
		
//		Produto Pedido
		ProdutoPedido ppModel = new ProdutoPedido(prodModel,pedidoModel,1);
		ProdutoPedidoView ppView = new ProdutoPedidoView();
		ProdutoPedidoController ppController = new ProdutoPedidoController(ppModel,ppView);
		
		ppController.updadeView();
	}
}
