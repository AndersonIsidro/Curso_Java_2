package Fundamentos;

public class OperadoresAritmeticos {
	public static void main(String[] args) {
		int num1 =3;
		int num2 =4;
		int num3 =5;
		
		// operadores : +-*/%
		int soma = num1 + num2 + num3 + 6;
		System.out.println(soma);
		System.out.println(num1 - num2 - num2);
		
		//cuidado com a precedencia(a ordem de calcular o resultado)
		System.out.println(num1 + num3 * num2 / 2);
		//quando quiser dar prioridade para calcular um primeiro colocar entre parentese 
		System.out.println((num1 + num3) * num2 / 2);
		
		//resto da divisao(ele faz a divisao entre os valores() e mostra o que sobra deste calculo)
		System.out.println(10 % 3);
		
		
	}
}
