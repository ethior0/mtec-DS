
public class Lucros {
	
	private double soma;

	public void registra(Conta c) {
		double saldo = c.getSaldo();
		this.setSoma(this.getSoma() + saldo);
	}

	// Getters e Setters
	public double getSoma() {
		return this.soma;
	}

	private void setSoma(double soma) {
		this.soma = soma;
	}
}