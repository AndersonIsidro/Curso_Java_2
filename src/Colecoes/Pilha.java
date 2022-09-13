package Colecoes;

import java.util.Stack;

public class Pilha {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		pilha.push("O Hobbit");
		pilha.push("O pequeno principe");
		pilha.push("Don Quixote");
		//para mostrar o ultimo que entrou e nao retirar da pilha usar .peek
		System.out.println("Peek...");
		System.out.println(pilha.peek());
		
		//para mostrar o ultimo e retirar da pilha usar .pop
		//quando nao tiver item retorna erro
		System.out.println("Pop...");
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		
		
		
		
		
	}
	

}
