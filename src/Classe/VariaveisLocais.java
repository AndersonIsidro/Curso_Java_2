package Classe;

public class VariaveisLocais {
	
	int a = 2;
	//variaveis locais ,como no exemplo abaixo nao podem ser usadas fora do metodo que esta
	void teste() {
		int a1 = 2;
		System.out.println(a);
		System.out.println(a1);
		if(a1 > 3) {
			int a2= 3;
			System.out.println(a2);
		}
	}

}
