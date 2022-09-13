package Classe;

public class ValorVsReferencia {
	//criou um objeto que acrescenta ao valor de numero
	static void porValor(double numero) {
		numero=1;
	}
	//criou um objeto que acrescenta ao 
	static void porReferencia(Produto produto) {
		produto.preco++;
	}
	
	public static void main(String[] args) {
		double numero = 1;
		
		Produto produto = new Produto("Caneta", 1);
		porValor(numero);
		porReferencia(produto);
		
		System.out.println(numero);
		System.out.println(produto.preco);
	}
}
