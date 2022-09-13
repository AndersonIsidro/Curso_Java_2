package Classe;

import javax.swing.JOptionPane;

public class CalculadoraTeste {
	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		String n2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
		double n3 =Double.parseDouble(n1);
		double n4 =Double.parseDouble(n2);
		
		
		// CRIANDO O METODO CONSTRUTOR
		Calculadora calc = new Calculadora();
		//UTILIZANDO METODO SOMAR QUE RETORNA UM VALOR NO CONSOLE
		System.out.println("soma dos numeros: " +calc.somar(n3,n4));
		//UTILIZANDO O METODO ACRESCENTAR QUE NAO RETORNA NADA SÓ ACRESCENTA AO VALOR SOMAR
		calc.acrescentar(10);
		//UTILIZANDO METODO OBTERRESULTADO QUE RETORNA O RESULTADO DA SOMA (SOMAR+ACRESCENTAR)
		System.out.println("acrescentando 10 ao resultado: " + calc.obterResultado());
		//UTILIZANDO METODO LIMPAR PARA ZERAR O RESULTADO E IMPRIMIR NO CONSOLE
		calc.limpar();
		System.out.println("console limpo: " + calc.obterResultado());
	}

}
