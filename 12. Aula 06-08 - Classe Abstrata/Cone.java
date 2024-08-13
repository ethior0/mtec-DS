package exClassAbstrata;

public class Cone extends FormaGeometrica {

	private double raio;
	private double altura;
	private double geratriz;
	private double area;
	
	public Cone(double raio, double altura, double geratriz) {
		this.setRaio(raio);
		this.setAltura(altura);
		this.setGeratriz(geratriz);
		
		this.setArea(0);
	}
	
	@Override
	public void formula() {
		System.out.printf("Fórmula do Cone: A = PI * %.2f * %.2f + PI * %.2f²", this.getRaio(), this.getGeratriz(), this.getRaio());
	}

	@Override
	public void area() {
		double newArea = (Math.PI * this.getRaio() * this.getGeratriz()) + (Math.PI * this.getRaio() * this.getRaio());
		this.setArea(newArea);
		System.out.printf("A = %.2f\n", this.getArea());
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getGeratriz() {
		return geratriz;
	}

	public void setGeratriz(double geratriz) {
		this.geratriz = geratriz;
	}

	public double getArea() {
		return area;
	}

	private void setArea(double area) {
		this.area = area;
	}
}
