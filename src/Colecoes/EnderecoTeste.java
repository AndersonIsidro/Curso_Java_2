package Colecoes;

public class EnderecoTeste {
	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua fim de Semana", 1, "Sala 1001");
		Endereco endereco2 = new Endereco("Rua fim de Semana", 1, "Sala 1001");
		System.out.println(endereco1 == endereco2);
		//só funcionou desta forma abaixou pq implementei o equals no objeto
		System.out.println(endereco1.equals(endereco2));
	}

}
