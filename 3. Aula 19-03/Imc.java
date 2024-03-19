
public class Imc {
  
	String nome;
	int idade;
	double peso;
	double altura;

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
