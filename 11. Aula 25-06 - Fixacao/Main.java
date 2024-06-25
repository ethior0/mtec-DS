package fixacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < 4; i++) {
			if (i < 2) {
				System.out.println("Carro " + (i+1));
			} else {
				System.out.println("Moto " + (i-1));
			}
			
			System.out.println("Digite o modelo:");
			String modelo = ler.next();
			System.out.println("Digite o valor de tabela:");
			double valorTabela = ler.nextDouble();
			System.out.println("Digite a cor do veículo:");
			String cor = ler.next();
			System.out.println("Digite a qtd de litros de combustível:");
			double combustivel = ler.nextDouble();
			
			if (i < 2) {
				Carro c1 = new Carro(modelo, valorTabela, cor, combustivel);
				c1.imprimirFicha();
				System.out.printf("IPVA: R$ %.2f\n", c1.calculaIpva());
			} else {
				Moto m1 = new Moto(modelo, valorTabela, cor, combustivel);
				m1.imprimirFicha();
				System.out.printf("IPVA: R$ %.2f\n", m1.calculaIpva());
			}

			System.out.println();
		}
		
		ler.close();
	}
}
