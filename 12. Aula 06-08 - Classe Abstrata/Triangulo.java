package exClassAbstrata;

public class Triangulo extends FormaGeometrica {

	private double base;
	private double altura;
	private double area;

	public Triangulo(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);

		this.setArea(0);
	}

	@Override
	public void formula() {
		System.out.printf("Fórmula do Triângulo: A = %.2f * %.2f / 2\n", this.getBase(), this.getAltura());
	}

	@Override
	public void area() {
		double newArea = this.getBase() * this.getAltura() / 2;
		this.setArea(newArea);
		System.out.printf("A = %.2f\n", this.getArea());
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArea() {
		return area;
	}

	private void setArea(double area) {
		this.area = area;
	}
}
