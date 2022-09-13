package Colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> aprovados = new HashMap<>();
		aprovados.put(1, "Pedro");
		aprovados.put(2, "Rafael");
		aprovados.put(31, "Maria");
		aprovados.put(4, "Joao");

		// usar . keyset para listar o que tem na primeira(chave) casa de map
		System.out.println(aprovados.keySet());

		// usar . values para listar o que tem na segunda(valor) casa de map
		System.out.println(aprovados.values());

		// usar .entrySet para listar o que tem em map completo(chave e valor)
		System.out.println(aprovados.entrySet());

		// usar .get para listar o que tem em map na chave selecionada
		System.out.println(aprovados.get(31));

		// usar containsKey ou value para saber se contem este item a lista
		// retorna v ou f
		System.out.println(aprovados.containsKey(31));
		System.out.println(aprovados.containsValue("Anderson"));

		// laço for para percorrer as chaves
		for (Integer codigo : aprovados.keySet()) {
			System.out.println("chaves: " + codigo);
		}
		// laço for para percorrer os valores
		for (String nomes : aprovados.values()) {
			System.out.println("valores: " + nomes);
		}
		// laço for para percorrer chaves e valores
		for (Entry<Integer, String> cv: aprovados.entrySet()) {
			System.out.println("Chaves e valores: " + cv);
		}

	}

}
