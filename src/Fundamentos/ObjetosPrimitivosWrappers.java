package Fundamentos;

public class ObjetosPrimitivosWrappers {
	public static void main(String[] args) {
		Character c = 'a';
		Boolean bo = true;
		
		Byte b = 1;
		Short s = 2;
		Integer i = 3;
		Long l =4L;
		
		Float f = 5.1f;
		Double d = 6.1;
		//no exemplo abaixo estou pegando a variavel boolean transformando em string com .tostring() 
		//e em seguida estou querendo saber o tamanho do texto descrito com .length()
		System.out.println(bo.toString().length());
		System.out.println(c);
		System.out.println(b + s + i + l + f + d);
	}

}
