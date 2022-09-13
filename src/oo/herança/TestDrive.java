package oo.herança;

public class TestDrive {
	public static void main(String[] args) {
		Carro c = new Civic();
		c.acelerar();
		
		System.out.println(c.getVelocidadeAtual());
	
		
		c = new Ferrari();
		c.acelerar();
	
		System.out.println(c.getVelocidadeAtual());
		
		System.out.println(c.velocidadeMaxima);
	}

}
