package controller;

import model.Produto;
import view.ProdutoView;

public class ProdutoController {
	
	private Produto model;
	private ProdutoView view;
	
	public ProdutoController (Produto model, ProdutoView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getProdutoIdProduto() {
		return model.getIdProduto();
	}
	public String getProdutoNomeProduto() {
		return model.getNomeProduto();
	}
	public String getProdutoDescricao() {
		return model.getDescricao();
	}
	public double getProdutoPreco() {
		return model.getPreco();
	}
	
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	public void setProdutoNomeProduto(String nomeProduto) {
		model.setNomeProduto(nomeProduto);
	}
	public void setProdutoDescricao(String descricao) {
		model.setDescricao(descricao);
	}
	public void setProdutoPreco(double preco) {
		model.setPreco(preco);
	}
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------	
	public void updateView() {
		view.printProdutoDetails(model.getIdProduto(), model.getNomeProduto(), model.getDescricao(), model.getPreco());
	}
}




