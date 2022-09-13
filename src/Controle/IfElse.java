package Controle;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a nota do aluno: ");
		double nota = entrada.nextDouble();
		
		if(nota >= 5 && nota <= 10) {
			System.out.println("Sua nota foi: " + (int)nota );
			System.out.println("Voce esta Aprovado");
		}
		else {
			System.out.println("Sua nota foi:" + (int)nota);
			System.out.println("Voce foi Reprovado");
		}
		
		
		entrada.close();
		}

}
