package Classe;

public class Produto {
	String nome;
	double preco;
	//estou determinando que o desconto vai ficar o  mesmo para todas instancias
	static double desconto;
	
	//this. na frente indica que esta associado apenas a variavel do construtor e nao da classe
	Produto(String n,double p){
		this.nome = n;
		this.preco = p;		
	}
	double precoComDesconto() {
		return preco - preco * desconto;
	}
	

}
