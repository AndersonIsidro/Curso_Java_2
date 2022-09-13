package api;

public class ExplorandoStringBuilder {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Joao");
		sb.append(" , ").append("Maria");
		sb.append(" , ").append("Pedro");
		
		// isso é um objeto mutavel- este metodo abaixo mostra a string ao contrario
		//sb.reverse();
		System.out.println(sb.toString());
		System.out.println(sb.substring(0, 3));
		
	}

}
