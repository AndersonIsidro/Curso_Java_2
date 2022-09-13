package api;

public class ExplorandoStrings {
	public static void main(String[] args) {
		
		String nome = "Leo"+"Nardo";
		
		System.out.println(nome.toUpperCase());
		System.out.println(nome.length());
		// serve para pegar determinado indice da string do 0 ao 3 digitopor exemplo
		System.out.println(nome.substring(0, 3));
		// serve para mostrar em qual indice achou esse caractere
		System.out.println(nome.indexOf('d'));
		// serve para saber se comeca com essas letras retorna v ou f
		System.out.println(nome.startsWith("Leo"));
		// serve para acrescentar algo a string
		System.out.println(nome.concat(" ele é legal").concat("!"));
		// toda string é imutavel- usamos todos estes metodos e a string continuou a mesma
	}

}
