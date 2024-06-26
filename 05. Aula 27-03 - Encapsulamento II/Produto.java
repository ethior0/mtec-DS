
public class Produto {

	private String nome;
	private double precoCusto; // preço que vc compra 
	private double precoVenda; // preço que vc vende
	private double margemLucro;
	
	// Nome
	String getNome() {
		return this.nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	// Preço Custo
	double getPrecoCusto() {
		return this.precoCusto;
	}
	
	void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	// Preço Venda
	double getPrecoVenda() {
		return this.precoVenda;
	}
	
	void setPrecoVenda(double precoVenda) {
		if (precoVenda > this.precoCusto) {
			this.precoVenda = precoVenda;
		} else { // precisa ter lucro, ou seja o preço de venda tem que ser maior que o de compra
			System.out.println("Erro: o preço de venda não pode ser menor que o preço de custo!");
		}
	}
	
	// Margem Lucro
	double getMargemLucro() {
		return this.margemLucro;
	}
	
	void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	double calcularMargemLucro() {
		double margem = this.precoVenda - this.precoCusto;
		this.setMargemLucro(margem);
		return margem;
	}
	
	double getMargemLucroPorcentagem() {
		return (this.getMargemLucro() / this.precoCusto) * 100;
	}
}
