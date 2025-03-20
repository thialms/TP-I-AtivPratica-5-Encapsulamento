package br.edu.fatecpg.atividadepratica5.view;
import br.edu.fatecpg.atividadepratica5.model.Produto;

public class ProdutoMain {
	
	public static void main(String[] args) {
		
		Produto teste = new Produto();
		
		teste.setPrecoProduto(-200);
		
		System.out.println(teste.getPrecoProduto());
		
		teste.setQuantidadeEstoque(2);
		
		System.out.println(teste.getQuantidadeEstoque());
		

	}

}



