
public class Calculadora {

	private String nome;
	private int resultadoInteiro;
	private double resultadoDouble;

	// Soma inteiros
	int soma(int num1, int num2) {
		this.setResultadoInteiro(num1 + num2);
		return this.getResultadoInteiro();
	}

	// Soma doubles
	double soma(double num1, double num2) {
		this.setResultadoDouble(num1 + num2);
		return this.getResultadoDouble();
	}

	// Soma array
	int soma(int[] array) {
		this.setResultadoInteiro(0);
		for (int num : array) {
			this.setResultadoInteiro(this.getResultadoInteiro() + num);
		}
		return this.getResultadoInteiro();
	}

	// Subtração inteiros
	int subtracao(int num1, int num2) {
		this.setResultadoInteiro(num1 - num2);
		return this.getResultadoInteiro();
	}
	
	// Subtração doubles
	double subtracao(double num1, double num2) {
		this.setResultadoDouble(num1 - num2);
		return this.getResultadoDouble();
	}
	
	// Subtração array
	int subtracao(int[] array) {
		this.setResultadoInteiro(array[0]);
		for (int i = 1; i < array.length; i++) {
			this.setResultadoInteiro(this.getResultadoInteiro() - array[i]);
		}
		return this.getResultadoInteiro();
	}
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getResultadoInteiro() {
		return resultadoInteiro;
	}

	public void setResultadoInteiro(int resultadoInteiro) { // private (?)
		this.resultadoInteiro = resultadoInteiro;
	}

	public double getResultadoDouble() {
		return resultadoDouble;
	}

	public void setResultadoDouble(double resultadoDouble) { // private (?)
		this.resultadoDouble = resultadoDouble;
	}
}
