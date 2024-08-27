import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Carro c1 = new Carro(null, 0, null, null, 0);
		System.out.println("Coloque o modelo do carro:");
		c1.setModelo(ler.next());
		System.out.println("Coloque o Valor da tabela do carro:");
		c1.setVT(ler.nextDouble());
		System.out.println("Coloque a cor do carro:");
		c1.setCor(ler.next());
		System.out.println("Coloque o tipo de combustivel do carro:");
		c1.setCombustivel(ler.next());
		c1.calculaIpva();

		System.out.println();
		System.out.println("Agora o segundo Carro:");
		System.out.println();

		Carro c2 = new Carro(null, 0, null, null, 0);
		System.out.println("Coloque o modelo do carro:");
		c2.setModelo(ler.next());
		System.out.println("Coloque o Valor da tabela do carro:");
		c2.setVT(ler.nextDouble());
		System.out.println("Coloque a cor do carro:");
		c2.setCor(ler.next());
		System.out.println("Coloque o tipo de combustivel do carro:");
		c2.setCombustivel(ler.next());
		c2.calculaIpva();

		System.out.println();

		System.out.println("Agora faça para sua Moto:");
		Moto m1 = new Moto(null, 0, null, null, 0);
		System.out.println("Coloque o modelo da moto:");
		m1.setModelo(ler.next());
		System.out.println("Coloque o Valor da tabela da moto:");
		m1.setVT(ler.nextDouble());
		System.out.println("Coloque a cor da moto:");
		m1.setCor(ler.next());
		System.out.println("Coloque o tipo de combustivel da moto:");
		m1.setCombustivel(ler.next());
		m1.calculaIpva();

		System.out.println();
		System.out.println("Agora a segunda Moto:");
		System.out.println();

		Moto m2 = new Moto(null, 0, null, null, 0);
		System.out.println("Coloque o modelo da moto:");
		m2.setModelo(ler.next());
		System.out.println("Coloque o Valor da tabela da moto:");
		m2.setVT(ler.nextDouble());
		System.out.println("Coloque a cor da moto:");
		m2.setCor(ler.next());
		System.out.println("Coloque o tipo de combustivel da moto:");
		m2.setCombustivel(ler.next());
		m2.calculaIpva();

		System.out.println();
		System.out.println("Carro 1:");
		c1.imprimirFicha();
		System.out.println();
		System.out.println("Carro 2:");
		c2.imprimirFicha();
		System.out.println();
		System.out.println("Moto 1:");
		m1.imprimirFicha();
		System.out.println();
		System.out.println("Moto 2:");
		m2.imprimirFicha();

		ler.close();
	}

}
