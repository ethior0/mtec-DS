public class Veiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	private String cor;

	// Apresentar
	void apresentarDados() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
		System.out.println("Cor: " + this.cor);
	}

	// Marca
	String getMarca() {
		return this.marca;
	}

	void setMarca(String marca) {
		this.marca = marca;
	}

	// Modelo
	String getModelo() {
		return this.modelo;
	}

	void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// Ano
	int getAno() {
		return this.ano;
	}

	void setAno(int ano) {
		this.ano = ano;
	}

	// Cor
	String getCor() {
		return this.cor;
	}

	void setCor(String cor) {
		this.cor = cor;
	}
}
