package fixacaoHeranca;

import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		JogoEletronico je1 = new JogoEletronico();
		
		System.out.println("Coloque o nome do jogo eletrônico:");
		je1.setNome(ler.next());
		
		System.out.println("Coloque o preço do jogo:");
		je1.setPreço(ler.nextDouble());
		
		System.out.println("Coloque a distribuidora do jogo:");
		je1.setDistribuidora(ler.next());
		
		System.out.println("Coloque a plataforma do jogo:");
		je1.setPlataforma(ler.next());
		
		System.out.println("Coloque o gênero do jogo:");
		je1.setGenero(ler.next());
		je1.apresentarDados();
		
		System.out.println("Ponha a quantidade de jogadores:");
		je1.jogarOnline(ler.nextInt());
		System.out.println();
		
		System.out.println("Agora para o jogo físico:");
		System.out.println();
		
		JogoFisico jf1 = new JogoFisico();
		
		System.out.println("Coloque o nome do jogo:");
		jf1.setNome(ler.next());
		
		System.out.println("Coloque o preço do jogo:");
		jf1.setPreço(ler.nextDouble());
		
		System.out.println("Coloque a distribuidora do jogo:");
		jf1.setDistribuidora(ler.next());
		
		System.out.println("Coloque a quantidade de jogadores:");
		jf1.setQuantJogadores(ler.nextInt());
		
		System.out.println("Coloque o tempo da partida:");
		jf1.setTempPartida(ler.nextInt());
		jf1.apresentarDados();
		
		System.out.println();
		System.out.println("Coloque o número de partidas:");
		System.out.println();
		System.out.println("Tempo total: " + jf1.calcularTempoTotal(ler.nextInt()) + " minutos");
		
		ler.close();
	}
}
