
public class Imc {
  
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	
	// Nome
	String getNome () {
		return this.nome;
	}
	void setNome (String nome) {
		this.nome = nome;
	}
	
	// Idade
	int getIdade () {
		return this.idade;
	}
	void setIdade (int idade) {
		this.idade = idade;
	}
	
	// Peso
	double getPeso () {
		return this.peso;
	}
	void setPeso (double peso) {
		this.peso = peso;
	}
  
	// Altura
	double getAltura () {
		return this.altura;
	}
	void setAltura (double altura) {
		this.altura = altura;
	}
	
	void calcularImc() {
		double imc = peso / (altura * altura);
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Peso normal");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println("Obesidade grau 1");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Obesidade grau 2");
		} else {
			System.out.println("Obesidade grau 3");
		}
		System.out.printf("Índice de Massa Corporal = %.2f", imc);
	}
}
