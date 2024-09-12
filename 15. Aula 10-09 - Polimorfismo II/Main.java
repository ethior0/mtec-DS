
public class Main {

	public static void main(String[] args) {
		
		Conteudo listaFilmes[] = new Conteudo[10];
		
		listaFilmes[0] = new Conteudo("Diário de um Banana", "Humor");
		listaFilmes[1] = new Filme("Blade Runner 2049", "Ficção", 163);
		listaFilmes[2] = new Filme("Clube da Luta", "Ação", 139);
		listaFilmes[3] = new Filme("Psicopata Americano", "Sátira", 102);
		listaFilmes[4] = new Filme("Homem-Aranha: Longe de Casa", "Filme de super-herói", 130);
		listaFilmes[5] = new Serie("The 100", "Distopia", 50, 100, 7);
		listaFilmes[6] = new Serie("La casa de papel", "Assalto", 50, 41, 5);
		listaFilmes[7] = new Serie("Stranger Things", "Ficção", 50, 34, 4);
		listaFilmes[8] = new Serie("Spectacular Spider-Man", "Ação", 20, 26, 2);
		listaFilmes[9] = new Serie("You", "Suspense", 50, 40, 4);
		
		for(int i = 0; i < listaFilmes.length-1; i++) {
			listaFilmes[i].descricao();
		}
	}
}
