package br.edu.fatecpg.atividadepratica5.model;

public class Produto {
	
	private String nomeProduto;
	private float precoProduto;
	private int quantidadeEstoque;
	
	public void setNomeProduto(String nome) {
		this.nomeProduto = nome;
	}
	
	public String getNomeProduto() {
		return this.nomeProduto;
	}
	
	public void setPrecoProduto(float preco) {
		if(preco < 0) {
			System.out.println("Não é possível definir um produto com valor negativo.");
		} else {
			this.precoProduto = preco;
		}
	}
	
	public float getPrecoProduto() {
		return this.precoProduto;
	}
	
	public void setQuantidadeEstoque(int qtd) {
		if(qtd >= 0) {
			this.quantidadeEstoque = qtd;
		}
	}
	
	public int getQuantidadeEstoque() {
		return this.quantidadeEstoque;
	}

}


