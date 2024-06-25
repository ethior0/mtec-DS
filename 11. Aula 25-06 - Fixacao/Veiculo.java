package fixacao;

public class Veiculo {

	private String modelo;
	private double valorTabela;
	private String cor;
	private double combustivel;
	private double ipva;
	
	// Construtor
	public Veiculo(String modelo, double valorTabela, String cor, double combustivel) {
		this.setModelo(modelo);
		this.setValorTabela(valorTabela);
		this.setCor(cor);
		this.setCombustivel(combustivel);
	}
	
	// Getters e Setters
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getValorTabela() {
		return this.valorTabela;
	}
	
	public void setValorTabela(double valorTabela) {
		this.valorTabela = valorTabela;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getCombustivel() {
		return this.combustivel;
	}
	
	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}
	
	public double getIpva() {
		return this.ipva;
	}
	
	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
	
	// Calcula IPVA
	public double calculaIpva() {
		return 0;
	}
	
	// Imprimir Ficha
	public void imprimirFicha() {
		System.out.println("Modelo: " + this.getModelo());
		System.out.printf("Valor de Tabela: R$ %.2f\n", this.getValorTabela());
		System.out.println("Cor: " + this.getCor());
		System.out.printf("Combustível em litros: %.1f l\n", this.getCombustivel());
	}
}
