package Fundamentos;

public class VariaveisEConstantes {
	public static void main(String[] args) {
		double raio = 4.5;
		final double PI = 3.1416;
		double area = PI * raio * raio ;
		System.out.println("Area é: " + area + " m2");
		System.out.printf("Area é %f m2 \n", area );
		//O simbolo %.2f significa que vai substituir o simbolo por uma 
		//variavel floating com duas casas decimais
		System.out.printf("Area é %.2f m2 ", area );
		
		
		
	}

}
