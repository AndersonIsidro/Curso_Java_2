package Controle;

import java.util.Scanner;

public class WhileDeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a nota: ");
		double somaDasNotas = 0;
		double nota = 0;
		
		int indice = 0;
		while(indice < 3 ) {
			nota = entrada.nextDouble();
			somaDasNotas += nota;
			indice++;
		}
		entrada.close();
		System.out.printf("A media é %.2f",somaDasNotas / 3);
	}

}
