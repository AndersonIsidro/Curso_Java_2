package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		//este tipo é para adicionar algo ao elemento conjunto
		Set conjunto = new HashSet();
		conjunto.add('a');
		conjunto.add("texto");
		conjunto.add(1);
		conjunto.add(3.14);
		conjunto.add(false);
		//essa forma tambem pode adicionar ao elemento conjunto direto no syso
		System.out.println("Add...");
		//este exemplo quando você adiciona algo que ja esta ao elemento ele retorna no console false
		System.out.println(conjunto.add(1));
		System.out.println(conjunto.add(10));
		
		System.out.println("Size..."+conjunto.size());
		//esta forma remove do elemento e retorna no console verdadeiro(true)quando consegue
		System.out.println(conjunto.remove('a'));
		System.out.println("Size..."+conjunto.size());
		
		System.out.println("Contains");
		//esta forma para questionar se existe isto dentro do conjunto
//		System.out.print(conjunto.contains(1);
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		//conjunto.addAll(nums) -isso faz com que os conjuntos se unam
		//esse serve para saber se um determinado elemento esta ou nao contido no conjunto citado
		conjunto.retainAll(nums);
		System.out.println("Size...");
		System.out.println(conjunto.size());
		
		//para limpar o conjunto
		conjunto.clear();
		//para saber se esta vazio o conjunto
		System.out.println(conjunto.isEmpty());
		
		
	}

}
