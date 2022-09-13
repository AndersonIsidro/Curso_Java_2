package Classe;

public class Data {
	int dia;
	int mes;
	int ano;

	Data(){
		
	}
	//.this significa que o dia do objeto é o mesmo que mes da instancia
	Data(int dia, int mes, int ano){
	this.dia = dia;
	this.mes  = mes;
	this.ano = ano;
	
	}
	
	
	
	
	String formatar(){
		return String.format("%d/%d/%d",dia, mes, ano);
		}
}
