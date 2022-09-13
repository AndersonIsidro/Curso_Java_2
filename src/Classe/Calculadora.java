package Classe;

public class Calculadora {

	double resultado;
	//soma 2 variaveis e retorna o resultado
	double somar(double a, double b) {
	 resultado = a + b; 
	 return resultado;
	}
	//recebe um valor e acrescenta a variavel nao retorna nada
	void acrescentar(double a) {
		resultado += a;
	}
	//este metodo retorna o resultado
	double obterResultado() {
		return resultado;
	}
	// este metodo pega o resultado e atribui o valor 0
	void limpar() {
		resultado = 0;
	}
}
