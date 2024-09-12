
public class Serie extends Conteudo {

	private int duracao;
	private int quantEpisodios;
	private int quantTemps;
	
	public Serie(String titulo, String categoria, int duracao, int quantEpisodios, int quantTemps) {
		super(titulo, categoria);
		this.setDuracao(duracao);
		this.setQuantEpisodios(quantEpisodios);
		this.setQuantTemps(quantTemps);
	}
	
	@Override
	public void descricao() {
		System.out.printf("Nome: %s - Categoria: %s - Duração(min): %d - Qtd. Episódios: %d - Qtd. Temporadas: %d\n", this.getTitulo(), this.getCategoria(), this.getDuracao(), this.getQuantEpisodios(), this.getQuantTemps());
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public int getQuantEpisodios() {
		return quantEpisodios;
	}
	
	public void setQuantEpisodios(int quantEpisodios) {
		this.quantEpisodios = quantEpisodios;
	}
	
	public int getQuantTemps() {
		return quantTemps;
	}
	
	public void setQuantTemps(int quantTemps) {
		this.quantTemps = quantTemps;
	}
}
