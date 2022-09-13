package Fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		boolean executouTrabalho1 = true;
		boolean executouTrabalho2 = true;
		
		boolean comprouSorvete= executouTrabalho1 || executouTrabalho2;
		boolean comprouTv50= executouTrabalho1 && executouTrabalho2;
		boolean comprouTv32= executouTrabalho1 ^ executouTrabalho2;
		
		System.out.println("Comprou sorvete ="+comprouSorvete);
		System.out.println("Comprou Tv de 50=" +comprouTv50);
		System.out.println("Comprou Tv de 32=" +comprouTv32);
	    //	operador unario intruso
		System.out.println("Esta com Fome: " + !comprouSorvete);
	
		
	}
	
	

}
