package oo.encapsulamento.casa2;

import oo.encapsulamento.casa1.Sogra;
import oo.encapsulamento.casa1.Sogro;

public class Filha extends Sogra{
	
		
	
	String segredoDoCasal = "Meu marido esta quase sendo demitido";
	
	public static void main(String[] args) {
	Filha euMesma = new Filha();
	System.out.println("Meus pais nao sabem , mais: " + euMesma.segredoDoCasal);
	
	Sogro pai = new Sogro();
	System.out.println("Meu pai gosta de cerveja? "+ pai.gostaDeCerveja);
	
//	forma errada de acessar por herança
//	Sogra mae = new Sogra();
//	System.out.println("Qual segredo da minha mae? "+ mae.);
	//forma correta:
	System.out.println("segredo da mamae:"+euMesma.segredoDeFamilia);
	}
	}

