
public class ContaPoupanca extends Conta {

	private double percentualRendimento = 0.01;

	public ContaPoupanca() {
	}

	public ContaPoupanca(String nome, String cpf, int cc, double saldo) {
		// TODO Auto-generated constructor stub
		super(nome, cpf, cc, saldo);
	}

	public double atualizarSaldo() {
		super.setSaldo(super.getSaldo() + (super.getSaldo() * this.getPercentualRendimento()));
		return super.getSaldo();
	}

	// Getters e Setters
	public double getPercentualRendimento() {
		return this.percentualRendimento;
	}

	private void setPercentualRendimento(double percentualRendimento) {
		this.percentualRendimento = percentualRendimento;
	}
}