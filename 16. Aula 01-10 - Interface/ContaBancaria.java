
public abstract class ContaBancaria implements OperacoesConta{

	private double saldo;
	
	public ContaBancaria(double saldo) {
		this.setSaldo(saldo);
	}
	
	@Override
	public void depositarSaldo(double valor) {
		// TODO Auto-generated method stub
		if (valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
		}
	}

	@Override
	public void sacarSaldo(double valor) {
		// TODO Auto-generated method stub
		if (valor > 0 && valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
		}
	}

	@Override
	public void verificarSaldo() {
		// TODO Auto-generated method stub
		System.out.printf("Saldo da conta: R$ %.2f\n", this.getSaldo());
	}
	
	// Getters e Setters
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
