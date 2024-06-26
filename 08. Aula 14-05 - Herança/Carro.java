public class Carro extends Veiculo {
  
	private int quantPortas;
 
	// Quantidade de Portas
	int getQuantPortas() {
		return this.quantPortas;
	}
 
	void setQuantPortas(int quantPortas) {
		this.quantPortas = quantPortas;
	}
 
	@Override
	void apresentarDados() { 
		super.apresentarDados();
		System.out.println("Quantidade de portas: " + this.quantPortas);
	}
}
