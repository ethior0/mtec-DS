import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um n�mero para saber se ele � Par ou �mpar");
		int N = ler.nextInt();
		System.out.println(N % 2 == 0 ? "N�mero Par" : "N�mero �mpar");
	}
}