package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		List<String> aprovados = new ArrayList<>();
		aprovados.add("Joao");
		aprovados.add("Pedro");
		aprovados.add("Carlos");
		aprovados.add("Maria");
		System.out.println("Get...");
		System.out.println(aprovados.get(0));
		//este pode repetir os elementos da lista ex:
		//abaixo para saber o tamanho da lista
		System.out.println("tamanho lista: "+aprovados.size());
		//add joao abaixo
		System.out.println("Add..");
		System.out.println(aprovados.add("Joao"));
		System.out.println("tamanholista: "+aprovados.size());
		//removi joao abaixo
		System.out.println(aprovados.remove("Joao"));
		System.out.println("tamanho lista: "+aprovados.size());
		for(String nome:aprovados) {
			System.out.println(nome);
		}
	}

}
