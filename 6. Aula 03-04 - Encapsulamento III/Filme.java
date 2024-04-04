
public class Filme {
	
	private String titulo;
	private int duracaoEmMinutos;

	String getTitulo() {
		return this.titulo;
	}

	void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	int getDuracaoEmMinutos() {
		return this.duracaoEmMinutos;
	}

	void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	void exibirDuracaoEmHoras() {
		int horas = this.duracaoEmMinutos / 60;
		int minutos = this.duracaoEmMinutos % 60;
		
		if (this.duracaoEmMinutos < 60) {
			System.out.println("O filme tem duração de " + minutos + " minutos.");
		} else if (minutos == 0) {
			System.out.println("O filme tem duração de " + horas + " hora(s).");
		} else {
			System.out.println("O filme tem duração de " + horas + " hora(s) e " + minutos + " minuto(s).");
		}
	}

	void apresentarFilme() {
		System.out.println("Nome: " + this.titulo);
		System.out.println("Duração em minutos: " + this.duracaoEmMinutos);
	}
}