package Controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		Scanner nota = new Scanner(System.in);
		System.out.println("Qual faixa do aluno: ");
		int aluno = nota.nextInt();
		
		switch(aluno) {
		case 10: case 9:
			System.out.println("Parabens nota A \nAprovado ");break;
		case 8: case 7:
			System.out.println("nota B \nAprovado Muito Bom");break;
		case 6: case 5:
			System.out.println("nota C \nAprovado Passou Raspando");break;
		case 4: case 3:
			System.out.println("nota D \nRecuperação");break;
		case 2: case 1: case 0:
			System.out.println("nota E \nReprovado");break;
		default :
			System.out.println("Digite uma nota válida!!");
				
		}	
		
		
	}

}
