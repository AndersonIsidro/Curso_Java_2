package oo.polimorfismo;

public class Pessoa {
	private double peso;
	
	public Pessoa(double pesoInicial) {
		this.peso =pesoInicial;
	}
	public double getPeso() {
		return peso;
	}
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
		}
	

}
