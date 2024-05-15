public class Moto extends Veiculo {
  
	private int cilindrada;
 
	// Cilindrada
	int getCilindrada() {
		return this.cilindrada;
	}
 
	void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	@Override
	void apresentarDados() { 
		super.apresentarDados();
		System.out.println("Cilindrada: " + this.cilindrada);
	}
}
