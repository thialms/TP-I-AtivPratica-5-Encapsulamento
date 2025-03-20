package br.edu.fatecpg.atividadepratica5.view;

import br.edu.fatecpg.atividadepratica5.model.Carro;

public class CarroMain {
 
	public static void main(String[] args) {
		Carro meuCarro = new Carro("Honda","Civic",2025,55);

		meuCarro.calcularReabastecer(6.35);
	}
}
