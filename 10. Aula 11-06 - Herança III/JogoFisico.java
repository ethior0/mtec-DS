package fixacaoHeranca;
 
public class JogoFisico extends Jogo {
	
	private int quantidadeJogadores;
	private int tempoPartida;
	
	//Quant
	public int getQuantJogadores() {
		return quantidadeJogadores;
	}
	
	public void setQuantJogadores(int quantidadeJogadores) {
		this.quantidadeJogadores = quantidadeJogadores;
	}
	
	//Tempo
	public int getTempPartida() {
		return tempoPartida;
	}
	
	public void setTempPartida(int tempoPartida) {
		this.tempoPartida = tempoPartida;
	}
	
	@Override
	void apresentarDados() { 
		super.apresentarDados();
		System.out.println("Quantidade de Jogadores: " + this.quantidadeJogadores);
		System.out.println("Tempo da partida: " + this.tempoPartida + " minutos");
	}
	
	int calcularTempoTotal (int quantPartidas) {
		int tempTotal = quantPartidas*this.tempoPartida;
		return tempTotal;
	}
}
