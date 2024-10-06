
public class ContaCorrente extends ContaBancaria {

	private double limiteCheque;
	private double saldoComLimite;
	
	public ContaCorrente(double saldo, double limiteCheque) {
		super(saldo);
		this.setLimiteCheque(limiteCheque);
		this.setSaldoComLimite(this.getSaldo() + this.getLimiteCheque());
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void depositarSaldo(double valor) {
		// TODO Auto-generated method stub
		if (valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
			this.setSaldoComLimite(this.getSaldo() + this.getLimiteCheque());
		}
	}
	
	
	@Override
	public void sacarSaldo(double valor) {
		if (valor > 0 && this.getSaldoComLimite() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			this.setSaldoComLimite(this.getSaldoComLimite() - valor);
			this.setSaldoComLimite(this.getSaldo() + this.getLimiteCheque());
		}
	}
	
	// Getters e Setters
	public double getLimiteCheque() {
		return this.limiteCheque;
	}
	
	public void setLimiteCheque(double limiteCheque) {
		this.limiteCheque = limiteCheque;
	}
	
	public double getSaldoComLimite() {
		return this.saldoComLimite;
	}
	
	public void setSaldoComLimite(double saldoComLimite) {
		this.saldoComLimite = saldoComLimite;
	}
}
