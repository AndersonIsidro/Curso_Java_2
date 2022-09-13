package Controle;

public class ContinueAninhado {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j==2) {
					continue;//o continue faz com que ele pule o laço em que ele seta atrelado
					//nesse exemplo o continue esta atrelado ao 2 que é o j
				}
				System.out.println(i + " " + j);
			}
			
		}
	}

}
