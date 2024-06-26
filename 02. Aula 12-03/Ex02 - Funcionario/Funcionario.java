
public class Funcionario {
	
	String nome;
	double salarioBruto;
	double imposto;
	
	double aumentaSalario(double valor) {
		salarioBruto += valor;
		return salarioBruto;
	}
	
	double salarioLiquido () {
	  return salarioBruto - imposto;
	}
	
}