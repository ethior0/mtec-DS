
public class ContaPoupanca extends ContaBancaria {

	public ContaPoupanca(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}
	
	public void aplicarRendimentoMensal(double taxa) {
		this.setSaldo(this.getSaldo() * (1 + (taxa / 100)));
	}
}
