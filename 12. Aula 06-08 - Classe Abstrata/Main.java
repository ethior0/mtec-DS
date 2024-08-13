package exClassAbstrata;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int res = 1;

		while (res == 1) {
			System.out.println("Escolha uma forma geométrica:");
			System.out.println("Quadrado-1, Triangulo- 2, Cone- 3, Trapézio- 4, Losango- 5. ");
			int forma = ler.nextInt();
			switch (forma) {
			case 1:
				System.out.println("Coloque o lado do quadrado: ");
				Quadrado q1 = new Quadrado(ler.nextDouble());
				q1.area();
				q1.formula();
				break;
			case 2:
				System.out.println("Coloque a base e a altura do triângulo:");
				Triangulo t1 = new Triangulo(ler.nextDouble(), ler.nextDouble());
				t1.area();
				t1.formula();
				break;
			case 3:
				System.out.println("Coloque o Raio a Altura e a Geratriz do cone:");
				Cone c1 = new Cone(ler.nextDouble(), ler.nextDouble(), ler.nextDouble());
				c1.area();
				c1.formula();
				break;
			case 4:
				System.out.println("Coloque a base menor, a base maior e a altura do trapézio:");
				Trapezio tp1 = new Trapezio(ler.nextDouble(), ler.nextDouble(), ler.nextDouble());
				tp1.area();
				tp1.formula();
				break;
			case 5:
				System.out.println("Coloque a diagonal menor e a diagonal maior do losango");
				Losango l1 = new Losango(ler.nextDouble(), ler.nextDouble());
				l1.area();
				l1.formula();
				break;
			default:
				System.out.println("ERRO: Código Inexistente");
			}
			System.out.println("Quer continuar? Sim-1, Não-2");
			res = ler.nextInt();
		}

		ler.close();
	}
}
