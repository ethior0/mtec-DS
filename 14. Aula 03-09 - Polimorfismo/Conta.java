
public class Conta {
	
	private String nome;
	private String cpf;
	private int numeroConta;
	private double saldo;

	public Conta() {
		
	}
	
	public Conta(String nome, String cpf, int numeroConta, double saldo) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setNumeroConta(numeroConta);
		this.setSaldo(saldo);
	}
	
	public double depositar(double valor) {
		if (valor > 0) {
			this.setSaldo(this.getSaldo() + valor);
		}
		return this.getSaldo();
	}

	public double sacar(double valor) {
		if (valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
		} else {
			System.out.println("Erro: Você não pode sacar mais do que você tem  na sua conta!");
		}
		return this.getSaldo();
	}

	public void imprimirSaldo() {
		System.out.printf("Saldo Atual: R$ %.2f\n", this.getSaldo());
	}

	// Getters e Setters
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta() {
		return this.numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
