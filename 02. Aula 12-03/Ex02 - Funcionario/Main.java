import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		// Primeiro Objeto
		Funcionario Funcionario1 = new Funcionario();
		Funcionario1.nome = "Pedro";
		
		System.out.println("Olá Usuário, escreva o salário Bruto:");
		Funcionario1.salarioBruto = ler.nextDouble();
		
		System.out.println("Ok, agora informe o valor que deve ser aumentado:");
		double valor = ler.nextDouble();
		
		System.out.println("Escreva o imposto:");
		Funcionario1.imposto = ler.nextDouble();

		System.out.println("O salário Bruto do " + Funcionario1.nome + " agora é R$" + Funcionario1.aumentaSalario(valor)
				+ " e o seu salário líquido é de: R$" + Funcionario1.salarioLiquido());

		System.out.println("------------------------------------------------------------------");

		// Segundo Objeto
		Funcionario Funcionario2 = new Funcionario();
		Funcionario2.nome = "Vagner";
		
		System.out.println("Olá Usuário, escreva o salário Bruto:");
		Funcionario2.salarioBruto = ler.nextDouble();
		
		System.out.println("Ok, agora informe o valor que deve ser aumentado:");
		valor = ler.nextDouble();
		
		System.out.println("Escreva o imposto:");
		Funcionario2.imposto = ler.nextDouble();

		System.out.println("O salário Bruto do " + Funcionario2.nome + " agora é R$" + Funcionario2.aumentaSalario(valor)
				+ " e o seu salário líquido é de: R$" + Funcionario2.salarioLiquido());
		
		ler.close();
	}
}