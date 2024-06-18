package fixacaoHeranca;

public class Jogo {
	private String nome;
	private double preço;
	private String distribuidora;
 
	//nome
	public String getNome() {
		return nome;
	}
 
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Preço
	public double getPreço() {
		return preço;
	}
 
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	//distribuidora
	public String getDistribuidora() {
		return distribuidora;
	}
 
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	// Apresentar
	void apresentarDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Preço: " + this.preço);
		System.out.println("Distribuidora: " + this.distribuidora);
	}
}
