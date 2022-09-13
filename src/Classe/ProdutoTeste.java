package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto.desconto = 0.50;
		//PRIMEIRO PRODUTO
		Produto p1 = new Produto("Notebook Acer",10000.0){
		
		};
		System.out.printf
		("nome do produto:%s\npreço do produto:%.2f\ndesconto:%.2f",p1.nome,p1.preco,Produto.desconto);
		System.out.println("\nValor com desconto:"+ p1.precoComDesconto() );
		//SEGUNDO
		Produto p2 = new Produto("Celular Samsung",4790.0){
			
		};
		System.out.printf
		("\n\nNome do produto:%s\npreço do produto:%.2f\ndesconto:%.2f",p2.nome,p2.preco,Produto.desconto);
		System.out.println("\nValor com desconto:"+ p2.precoComDesconto() );
		
		//TERCEIRO
		Produto p3 = new Produto("TV 50 polegadas",3895.0){
			
		};
		System.out.printf
		("\n\nNome do produto:%s\npreço do produto:%.2f\ndesconto:%.2f",p3.nome,p3.preco,Produto.desconto);
		System.out.println("\nValor com desconto:"+ p3.precoComDesconto() );
		
		
	}

}
