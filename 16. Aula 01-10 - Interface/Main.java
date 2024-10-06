import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int res = 1;
		
		while (res == 1) {
			System.out.println("Escolha o tipo de conta:");
			System.out.printf(
					  "[1 - %-15s]\n"
					+ "[2 - %-15s]\n"
					, "Conta Corrente", "Conta Poupança"
					);
			int tipoConta = ler.nextInt();
			
			System.out.println("Digite o saldo da conta:");
			double saldo = ler.nextDouble();
			
			ContaBancaria conta;
			
			if (tipoConta == 1) {
				System.out.println("Digite o limite do cheque especial:");
				double limiteCheque = ler.nextDouble();
				conta = new ContaCorrente(saldo, limiteCheque);
			} else {
				conta = new ContaPoupanca(saldo);
			}
			
			int res2 = 1;
			while (res2 == 1) {
				System.out.println("Escolha uma ação da conta:");
				System.out.printf(
						  "[1 - %-18s]\n"
						+ "[2 - %-18s]\n"
						+ "[3 - %-18s]\n"
						, "Depositar", "Sacar", "Imprimir Saldo"
						);
				if (conta instanceof ContaPoupanca) {
					System.out.printf("[4 - %-18s]\n", "Rendimento Mensal");
				}
				
				int acaoConta = ler.nextInt();
				
				if (acaoConta == 1) {
					System.out.println("Digite a quantidade que você deseja depositar:");
					conta.depositarSaldo(ler.nextDouble());
				} else if (acaoConta == 2) {
					System.out.println("Digite a quantidade que você deseja sacar:");
					conta.sacarSaldo(ler.nextDouble());
				} else if (acaoConta == 3) {
					conta.verificarSaldo();
				} else if (acaoConta == 4 && conta instanceof ContaPoupanca) {
					System.out.println("Digite a taxa para aplicar o rendimento mensal: (Ex.: 50)");
					((ContaPoupanca) conta).aplicarRendimentoMensal(ler.nextDouble());
				} else {
					System.out.println("Ação inválida!");
				}
				
				System.out.println("Deseja executar mais alguma ação? (1 - Sim | 2 - Não)");
				res2 = ler.nextInt();
			}
		
			System.out.println("Deseja criar uma nova conta? (1 - Sim | 2 - Não)");
			res = ler.nextInt();
		}
		
		System.out.println("... fim do programa");
		
		ler.close();
	}
}
