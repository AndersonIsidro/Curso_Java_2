package Controle;

import javax.swing.JOptionPane;

public class IfElseIf {
	public static void main(String[] args) {
		String nota = JOptionPane.showInputDialog("Qual a nota Aluno 1: ");
		int  aluno = Integer.parseInt(nota);
		
		if(aluno <= 0 || aluno >= 11 ) {
			System.out.print("Comando Invalido , voce digitou: " + aluno);
		}else if (aluno >= 9 ) { 
			System.out.println("Sua nota foi: " + aluno);
			System.out.println("Quadro de Honra");
		}else if (aluno >= 7) {
			System.out.println("Sua nota foi: " + aluno);
			System.out.println("Aprovado");
		}else if (aluno >= 5) {
			System.out.println("Sua nota foi: " + aluno);
			System.out.println("Aprovado no limite");
		}else if (aluno >= 3) {
			System.out.println("Sua nota foi: " + aluno);
			System.out.println("recuperação");
		}else {
			System.out.println("Sua nota foi: " + aluno);
			System.out.println("Reprovado");
		}
		
		
	}

}
