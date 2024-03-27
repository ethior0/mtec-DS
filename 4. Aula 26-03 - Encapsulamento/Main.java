import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Imc pessoa1 = new Imc();

		System.out.println("Olá Usuário, qual o seu nome?:");
		pessoa1.setNome(ler.next()); 
		
		System.out.println("Olá "+pessoa1.getNome()+ " Por favor digite sua idade:");
		pessoa1.setIdade(ler.nextInt());
		
		System.out.println("Agora digite a sua altura em metros:");
		pessoa1.setAltura(ler.nextDouble());
		
		System.out.println("Por favor, o seu peso atual:");
		pessoa1.setPeso(ler.nextDouble());
		
		pessoa1.calcularImc();
	}
}
