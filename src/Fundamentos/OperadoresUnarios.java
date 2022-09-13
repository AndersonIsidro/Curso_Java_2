package Fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		//Incremento e Decremento
		num1++;//acrescenta o numero 1
		System.out.println(num1);
		--num1;//descrescenta o numero 1
		System.out.println(num1);
		
		System.out.println(++num1 == num2--);// a precedencia pode mudar o calculo de acordo 
		                                     //como onde esta incremento ou decremento
		System.out.println(++num1 == --num2);
		
		//Complemento binario
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));
		
		//negacao(mostra o contrario da variavel citada)
		System.out.println(!true);
		
		
		
		
	}

}
