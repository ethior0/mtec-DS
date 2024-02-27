import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se ele é Par ou Ímpar");
		int N = ler.nextInt();
		System.out.println(N % 2 == 0 ? "Número Par" : "Número Ímpar");
	}
}