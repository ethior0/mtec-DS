
public class Conteudo {

	private String categoria;
	private String titulo;
	
	public Conteudo(String titulo, String categoria) {
		this.setCategoria(categoria);
		this.setTitulo(titulo);
	}
	
	public void descricao() {
		System.out.printf("Nome: %s - Categoria: %s\n", this.getTitulo(), this.getCategoria());
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
