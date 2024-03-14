
public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Primeiro Objeto
		Quadrado Quadrado1 = new Quadrado();
		Quadrado1.base = 6;
		Quadrado1.altura = 6;
		
		// Segundo Objeto
		Quadrado Quadrado2 = new Quadrado();
		Quadrado2.base = 12;
		Quadrado2.altura = 12;
		
		System.out.println( "A área do primeiro quadrado é:" +Quadrado1.calcularArea() );
		System.out.println( "A área do segundo quadrado é:" +Quadrado2.calcularArea() );
	}
}