
public class Filme extends Conteudo {

	private int duracao;
	
	public Filme(String titulo, String categoria, int duracao) {
		super(titulo, categoria);
		this.setDuracao(duracao);
	}

	@Override
	public void descricao() {
		System.out.printf("Nome: %s - Categoria: %s - Duração(min): %d\n", this.getTitulo(), this.getCategoria(), this.getDuracao());
	}
	
	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
}
