package Classe;


public class DataTeste {
	public static void main(String[] args) {
		Data nascimento = new Data();
		
		nascimento.dia =19;
		nascimento.mes =11;
		nascimento.ano =1987;
		System.out.println(nascimento.formatar());//puxou o formatar da outra classe
		System.out.printf("%d/%d/%d",nascimento.dia,nascimento.mes,nascimento.ano);
		
	}

}
