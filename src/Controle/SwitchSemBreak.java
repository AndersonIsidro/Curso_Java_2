package Controle;

import java.util.Scanner;

public class SwitchSemBreak {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual faixa do aluno: ");
		String aluno1 = entrada.next().toLowerCase();
		
		switch(aluno1) {
		case "preta":
				System.out.println("Parabens faixa preta");
		case "vermelha":
			System.out.println("Parabens faixa vermelha");
		case "azul":
			System.out.println("Parabens faixa azul");
		case "amarela":
			System.out.println("Parabens faixa amarela");
		case "marrom":
			System.out.println("Parabens faixa marrom");
		default:
			System.out.println("Entrada Incorreta");
		}
		
	}

}
