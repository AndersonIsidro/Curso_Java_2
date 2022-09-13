package Fundamentos;

import javax.swing.JOptionPane;

public class OperadorTernario {
	public static void main(String[] args) {

		String aluno1 = JOptionPane.showInputDialog("Qual a nota Aluno 1: ");
		String aluno2 = JOptionPane.showInputDialog("Qual a nota Aluno 2: ");
		String aluno3 = JOptionPane.showInputDialog("Qual a nota Aluno 3: ");
		String aluno4 = JOptionPane.showInputDialog("Qual a nota Aluno 4: ");
		String aluno5 = JOptionPane.showInputDialog("Qual a nota Aluno 5: ");
		double nota1 = Double.parseDouble(aluno1);
		double nota2 = Double.parseDouble(aluno2);
		double nota3 = Double.parseDouble(aluno3);
		double nota4 = Double.parseDouble(aluno4);
		double nota5 = Double.parseDouble(aluno5);
		String resultado1 = nota1 >= 5 ? "Aprovado" : "Recuperação";
		System.out.println(resultado1);
		if (resultado1 == "Aprovado") {
			System.out.println("Parabens aluno1");
			System.out.println("Sua nota é:" + (int)nota1 + "\n");

		} else {
			System.out.println("Se fudeu aluno1\n");

		}

		String resultado2 = nota2 >= 5 ? "Aprovado" : "Recuperação";
		System.out.println(resultado2);
		if (resultado2 == "Aprovado") {
			System.out.println("Parabens 2\n");

		} else {
			System.out.println("Se fudeu 2\n");

		}

		String resultado3 = nota3 >= 5 ? "Aprovado" : "Recuperação";
		System.out.println(resultado3);
		if (resultado3 == "Aprovado") {
			System.out.println("Parabens 3\n");

		} else {
			System.out.println("Se fudeu 3\n");

		}

		String resultado4 = nota4 >= 5 ? "Aprovado" : "Recuperação";
		System.out.println(resultado4);
		if (resultado4 == "Aprovado") {
			System.out.println("Parabens4\n");

		} else {
			System.out.println("Se fudeu4\n");

		}

		String resultado5 = nota5 >= 5 ? "Aprovado" : "Recuperação";
		System.out.println(resultado5);
		if (resultado5 == "Aprovado") {
			System.out.println("Parabens5\n");

		} else {
			System.out.println("Se fudeu5\n");

		}

	}

}
