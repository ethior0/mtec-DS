import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a Senha:");
		
		int senha = ler.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida");
			
			senha = ler.nextInt();
			
			if (senha==2002) {
				System.out.println("Acesso Permitido");
			}
		}
		
		ler.close();
	}
}