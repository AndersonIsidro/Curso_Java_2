package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogro;

public class Genro {
	private String segredo = "Minha sogra fala demais!";
	
	public static void main(String[] args) {
		Genro euMesmo = new Genro();
		System.out.println("Meu segredo é: "+ euMesmo.segredo);
		
		Filha meuAmor = new Filha();
		System.out.println(meuAmor.segredoDoCasal);
		
		Sogro sograo = new Sogro();
		System.out.println("Será que ele gosta de Cerveja? "+ sograo.gostaDeCerveja);
		
//		Sogra sogrona = new Sogra();
//		System.out.println(sogrona.s);
	}

}
