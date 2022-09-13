package oo.herança;

public class Ferrari extends Carro{
	
	public Ferrari() {
		velocidadeMaxima = 350;
		
	}
	public void acelerar() {
		super.acelerarMais(70);
	}

}
