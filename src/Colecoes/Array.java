package Colecoes;

public class Array {
	public static void main(String[] args) {
		//tipos de array ex 1:
		double[] notasJoao = {7.0, 8.7, 6.2, 4.9, 9.7};
		//exemplo 2
		double[] notasPedro = new double[5];
		notasPedro[0] = 7.0;
		notasPedro[1] = 8.7;
		notasPedro[2] = 6.2;
		notasPedro[3] = 4.9;
		notasPedro[4] = 9.7;
		
		System.out.println(notasJoao[0] + "\n"+ notasPedro[0]+"\n");
		
		double totalJoao = 0;
		for(double nota: notasJoao) {
			totalJoao += nota;
		}
//		for (int i = 0; i < notasJoao.length; i++) {
//			totalJoao += notasJoao[i];
//		}
//		significa que atraves deste for estou atribuindo notaspedro a variavel nota1
//		e em seguida acrescento todo percurso do array a variavel totalPedro
		double totalPedro = 0;
		for(double nota1: notasPedro) {
			totalPedro += nota1;
		}
//		for (int i = 0; i < notasPedro.length; i++) {
//			totalJoao += notasJoao[i];
//		}
		
		System.out.println(totalJoao / notasJoao.length);
		System.out.println(totalPedro / notasPedro.length);
		
	}

}
