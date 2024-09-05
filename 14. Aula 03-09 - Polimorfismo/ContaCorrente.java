
public class ContaCorrente extends Conta {

	private double tarifaMensal;

	public ContaCorrente() {
	}
	
	public ContaCorrente(String nome, String cpf, int cc, double saldo) {
		// TODO Auto-generated constructor stub
		super(nome, cpf, cc, saldo);
	}

	// Getters e Setters
	public double getTarifaMensal() {
		return this.tarifaMensal;
	}

	public void setTarifaMensal(double tarifaMensal) {
		this.tarifaMensal = tarifaMensal;
	}
}