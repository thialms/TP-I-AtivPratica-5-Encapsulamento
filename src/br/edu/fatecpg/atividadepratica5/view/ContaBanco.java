package br.edu.fatecpg.atividadepratica5.view;
import br.edu.fatecpg.atividadepratica5.model.Conta;
public class ContaBanco {

	public static void main(String[] args) {
		Conta contaAle = new Conta(1000,777,"Ale");
		Conta contaThaisC = new Conta(1000,111,"Thais Carla");
		
		
		contaAle.depositar(0);
		contaAle.sacar(100);

		
		contaThaisC.depositar(0);
		contaThaisC.sacar(450);
		
		
		System.out.println("Saldo Atual Ale: " + contaAle.getSaldo());
		System.out.println("Saldo Atual Thais: " + contaThaisC.getSaldo());

	}

}
