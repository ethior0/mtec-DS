import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		Carro c1 = new Carro();
		System.out.println("Coloque a marca do carro:");
		c1.setMarca(ler.next());
		System.out.println("Coloque o modelo do carro:");
		c1.setModelo(ler.next());
		System.out.println("Coloque o ano do carro:");
		c1.setAno(ler.nextInt());
		System.out.println("Coloque a cor do carro:");
		c1.setCor(ler.next());
		System.out.println("Coloque a quantidade de portas do carro:");
		c1.setQuantPortas(ler.nextInt());

		c1.apresentarDados();
		
		System.out.println();
		
		// Moto
		Moto m1 = new Moto();
		System.out.println("Coloque a marca da moto:");
		m1.setMarca(ler.next());
		System.out.println("Coloque o modelo da moto:");
		m1.setModelo(ler.next());
		System.out.println("Coloque o ano da moto:");
		m1.setAno(ler.nextInt());
		System.out.println("Coloque a cor da moto:");
		m1.setCor(ler.next());
		System.out.println("Coloque a cilindrada da moto:");
		m1.setCilindrada(ler.nextInt());
		
		m1.apresentarDados();
	}
}
