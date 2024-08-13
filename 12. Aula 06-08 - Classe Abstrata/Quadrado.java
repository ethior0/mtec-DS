package exClassAbstrata;

public class Quadrado extends FormaGeometrica {

	private double lado; 
	private double area;
	
	public Quadrado(double lado) {
		this.setLado(lado);
		
		this.setArea(0);
	}
	
	@Override
	public void formula() {
		System.out.printf("Fórmula do Quadrado: A = %.2f * %.2f\n", this.getLado(), this.getLado());
	}

	@Override
	public void area() {
		double newArea = this.getLado() * this.getLado(); 
		this.setArea(newArea);
		System.out.printf("A = %.2f\n", this.getArea());
	}

	public double getLado() {
		return this.lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getArea() {
		return this.area;
	}
	
	private void setArea(double area) {
		this.area = area;
	}
}
