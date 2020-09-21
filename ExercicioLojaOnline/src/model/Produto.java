package model;

public class Produto {
	
	private static int idProduto;
	private String nomeProduto;
	private String descricao;
	private double preco;
	
	public Produto(String nomeProduto, String descricao, double preco) {
		this.nomeProduto = nomeProduto;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getPreco() {
		return preco;
	}
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	//----------------------------------------------------------------------------------------
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}

