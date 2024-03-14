import java.util.Scanner;
 
public class Ex1 {
 
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número para saber se ele é positivo ou negativo");
		int N = ler.nextInt();
		System.out.println(N >= 0 ? "Número positivo" : "Número negativo");
	}
}
