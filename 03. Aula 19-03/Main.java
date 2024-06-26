import java.util.Scanner;

public class Main {
  
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Imc pessoa1 = new Imc();

		System.out.println("Olá Usuário, qual o seu nome?:");
		pessoa1.nome = ler.next();
		
		System.out.println("Olá "+pessoa1.nome+ " Por favor digite sua idade:");
		pessoa1.idade = ler.nextInt();
		
		System.out.println("Agora digite a sua altura em metros:");
		pessoa1.altura = ler.nextDouble();
		
		System.out.println("Por favor, o seu peso atual:");
		pessoa1.peso = ler.nextDouble();
		
		pessoa1.calcularImc();
	}
}
