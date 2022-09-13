package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
	
	Queue<String> fila = new LinkedList<String>();
	//offer ou add adicionam elemento a fila
	//quando offer nao conseguir adicionar elemento na fila ele retorna falso
	//quando add nao conseguir adicionar elemento na fila ele retorna erro
	fila.offer("Joao");
	fila.add("Pedro");
	fila.add("Maria");
	fila.add("Jose");
	//peek ou element retornam os proximos elementos da fila no console
	//peek quando a fila estiver vazia retorna nulo
	//element quando a fila estiver vazia retorna erro
	System.out.println("Peek/Element");
	System.out.println(fila.peek());
	System.out.println(fila.element());
	//pool ou remove removem o proximo elemento da fila e mostram no console quem foi removido 
	//poll retorna nulo se nao estiver ninguem na fila
	//poll retorna erro se nao estiver ninguem na fila
	System.out.println("Pool/remove");
	System.out.println(fila.poll());
	System.out.println(fila.remove());
	System.out.println(fila.poll());
	System.out.println(fila.remove());
	}
}
