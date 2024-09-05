import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int cc = 1, res = 1;
		Lucros lucro = new Lucros();
		
		while (res == 1) {
			System.out.println("Escolha o tipo de conta:");
			System.out.printf(
					  "[1 - %-15s]\n"
					+ "[2 - %-15s]\n"
					+ "[3 - %-15s]\n"
					, "Conta Normal", "Conta Corrente", "Conta Poupança"
					);
			int tipoConta = ler.nextInt();
			
			System.out.println("Digite seu nome:");
			String nome = ler.next();
			System.out.println("Digite seu CPF:");
			String cpf = ler.next();
			System.out.println("Digite seu saldo:");
			double saldo = ler.nextDouble();
			
			Conta conta;
			
			if (tipoConta == 1) {
				conta = new Conta(nome, cpf, cc, saldo);
			} else if (tipoConta == 2) {
				conta = new ContaCorrente(nome, cpf, cc, saldo);
				System.out.println("Digite a tarifa mensal:");
				((ContaCorrente) conta).setTarifaMensal(ler.nextDouble());
			} else {
				conta = new ContaPoupanca(nome, cpf, cc, saldo);
			} 
			
			int res2 = 1;
			while (res2 == 1) {
				System.out.println("Escolha uma ação da conta:");
				System.out.printf(
						  "[1 - %-15s]\n"
						+ "[2 - %-15s]\n"
						+ "[3 - %-15s]\n"
						, "Depositar", "Sacar", "Imprimir Saldo"
						);
				if (conta instanceof ContaPoupanca) {
					System.out.printf("[4 - %-15s]\n", "Atualizar Saldo");
				}
				int acaoConta = ler.nextInt();
				
				if (acaoConta == 1) {
					System.out.println("Digite a quantidade que você deseja depositar:");
					conta.depositar(ler.nextDouble());
				} else if (acaoConta == 2) {
					System.out.println("Digite a quantidade que você deseja sacar:");
					conta.sacar(ler.nextDouble());
				} else if (acaoConta == 3) {
					conta.imprimirSaldo();
				} else if (acaoConta == 4 && conta instanceof ContaPoupanca) {
					((ContaPoupanca) conta).atualizarSaldo();
					System.out.println("Saldo atualizado");
				} else {
					System.out.println("Ação inválida");
				}
				
				System.out.println("Deseja executar mais alguma ação? (1 - Sim | 2 - Não)");
				res2 = ler.nextInt();
			}
			
			lucro.registra(conta);
			
			System.out.println("Deseja mostrar os lucros? (1 - Sim | 2 - Não)");
			int resLucro = ler.nextInt();
			if (resLucro == 1) {
				System.out.println("Lucro Atual: " + lucro.getSoma());
			}
			
			System.out.println("Deseja criar uma nova conta? (1 - Sim | 2 - Não)");
			res = ler.nextInt();
			
			cc++;
		}
		
		System.out.println("... fim do programa");
		
		ler.close();
	}
}