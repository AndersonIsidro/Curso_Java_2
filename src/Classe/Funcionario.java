package Classe;

public class Funcionario {

	String nome;
	int salario;
	String funcao;
	
	Funcionario(){
		
	}
	Funcionario(String n, int s , String f){
		nome = n;
		salario = s;
		funcao = f;
	};
	String funcionario2(){
		return String.format("%sSalario:%d%s\n",nome, salario, funcao);
		}
}
