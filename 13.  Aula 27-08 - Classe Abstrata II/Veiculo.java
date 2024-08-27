public abstract class Veiculo {
	private String modelo;
	private double valorTabela;
	private String Cor;
	private String Combustivel;
	private double Ipva;

	public Veiculo(String modelo, double valorTabela, String Cor, String Combustivel, double Ipva) {
		this.modelo = modelo;
		this.valorTabela = valorTabela;
		this.Cor = Cor;
		this.Combustivel = Combustivel;
		this.Ipva = Ipva;
	}

	// Modelo
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

//Valor Tabela
	public double getVT() {
		return this.valorTabela;
	}

	public void setVT(double valorTabela) {
		this.valorTabela = valorTabela;
	}

//Cor
	public String getCor() {
		return this.Cor;
	}

	public void setCor(String Cor) {
		this.Cor = Cor;
	}

//Combustivel
	public String getCombustivel() {
		return this.Combustivel;
	}

	public void setCombustivel(String Combustivel) {
		this.Combustivel = Combustivel;
	}

//IPVA
	public double getIpva() {
		return this.Ipva;
	}

	public void setIpva(double Ipva) {
		this.Ipva = Ipva;
	}

	public abstract void calculaIpva();

	void imprimirFicha() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Valor Tabela: " + this.valorTabela);
		System.out.println("Cor: " + this.Cor);
		System.out.println("Combustível: " + this.Combustivel);
		System.out.println("Seu IPVA é: " + this.Ipva);
	}

}
