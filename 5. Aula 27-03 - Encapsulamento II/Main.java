import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		Produto p1 = new Produto();
		
		System.out.println("Coloque o nome do produto:");
		p1.setNome(ler.next());
		
		System.out.println("Coloque o preço de custo:");	
		p1.setPrecoCusto(ler.nextDouble());
		
		System.out.println("Coloque o preço de venda:");
		p1.setPrecoVenda(ler.nextDouble());
		
		System.out.println("Produto: " + p1.getNome());
		System.out.printf("Lucro: R$%.2f\n", p1.calcularMargemLucro());		
		System.out.printf("Porcentagem de lucro: %.2f%%\n", p1.getMargemLucroPorcentagem());
		
		ler.close();
	}
}
