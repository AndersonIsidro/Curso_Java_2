package Classe;

public class FuncionarioDoAno {
	public static void main(String[] args) {
		Funcionario dev1 = new Funcionario();
		dev1.nome ="Roberto";
		dev1.salario =3090;
		dev1.funcao ="Vigilante";
		System.out.printf("%s\n%d\n%s\n\n",dev1.nome,dev1.salario,dev1.funcao);
		
		Funcionario dev2 = new Funcionario("Nome:Antonio\n",1080,"\nCargo: diretor");
		System.out.println(dev2.funcionario2());
		
		Funcionario dev3 = new Funcionario("Nome:Carlos\n",2750,"\nCargo:estoquista");
		System.out.println(dev3.funcionario2());
		
		Funcionario dev4 = new Funcionario("Nome:Augusto\n",1980,"\nCargo:motorista");
		System.out.println(dev4.funcionario2());
		
		Funcionario dev5 = new Funcionario("Nome:Felipe\n",3000,"\nCargo:manobrista");
		System.out.println(dev5.funcionario2());
		
		
		
	}

}
