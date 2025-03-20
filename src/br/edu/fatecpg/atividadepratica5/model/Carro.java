package br.edu.fatecpg.atividadepratica5.model;
 
public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private boolean ligado;
	private int velocidade = 0;
	private int capacidadeTanque;
	
	public Carro(String ma, String mo, int ano, int ct){
		this.setMarca(ma);
		this.setModelo(mo);
		this.setAno(ano);
		this.setCapacidadeTanque(ct);
	}
	
	public void ligar() {
		System.out.println("Carro Ligando...");
		System.out.println("Carro Ligado!");
		this.ligado = true;
	}
	
	public void acelerar() {
		if(ligado) {	
			if(this.velocidade < 160) {
				this.velocidade += 20;
				System.out.println("Acelerando..." + this.velocidade + " KM/H");
			} else {
				System.out.println("Velocidade máxima atingida!");
			}
		} else {
			System.out.println("O carro precisa estar ligado para acelerar!");
		}	
	}
	
	public void frear() {
		if(this.velocidade > 0) {
			if (this.velocidade < 30) {
				this.velocidade = 0;
			} else {
				this.velocidade -= 30;
			}
			System.out.println("Freiando... " + this.velocidade + " KM/H");
		} else {
			System.out.println("Carro parou!");
			this.velocidade = 0;
		}
	}

	public void calcularReabastecer(double preco_gasolina) {
		System.out.println("com o tanque em "+this.capacidadeTanque
		+"L, o valor para reabastecer o carro completamente é R$"
		+String.format("%.2f",(this.capacidadeTanque * preco_gasolina)));
	}
	
	public void desligar() {
		System.out.println("Carro Desligado...");
		this.ligado = false;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	public boolean isLigado() {
		return ligado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	private void setAno(int ano) {
		this.ano = ano;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
}