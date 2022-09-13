package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
	public static void main(String[] args) {
		//dessa forma o set recebe apenas tipo String
		Set<String> aprovados = new HashSet<>();
		aprovados.add("João");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");
		
		for(String nome : aprovados) {
			System.out.println(nome);
		}
	}

}
