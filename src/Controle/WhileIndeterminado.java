package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma nota valida: ");
		double somaDasNotas = 0;
		double nota = 0;
		int numeroDeNotas = 0;
		while(nota!= -1) {
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				somaDasNotas += nota;
				numeroDeNotas++;
			}else {
				System.out.println("Nota Invalida");
			}
		}
		entrada.close();
		System.out.printf("A media é %.2f " , somaDasNotas / numeroDeNotas);
	}

}
