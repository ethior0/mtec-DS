
public class Main {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		calc.setNome("Calc TOP");
		
		// Soma
		System.out.println(calc.soma( 12, 42 ));
		System.out.println(calc.soma( 24.3, 1.4 ));
		System.out.println(calc.soma( new int[] {10, 20, 5} ));
		
		// Subtração
		System.out.println(calc.subtracao( 1, 1 ));
		System.out.println(calc.subtracao( 10.9, 0.2 ));
		System.out.println(calc.subtracao( new int[] {50, 1, 2} ));
	}
}
