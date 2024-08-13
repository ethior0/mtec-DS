package exClassAbstrata;
 
public class Trapezio extends FormaGeometrica {
	private double b;
	private double B;
	private double altura;
	private double area;
	public Trapezio(double b, double B, double altura) {
		this.setbm(b);
		this.setBM(B);
		this.setAltura(altura);
		this.setArea(0);
	}
	@Override
	public void formula() {
		System.out.printf("Fórmula do Trapézio: A = (%.2f + %.2f) * %.2f/2\n", this.getbm(), this.getBM(), this.getAltura());
	}
	@Override
	public void area() {
		double newArea = (this.getbm() + this.getBM()) * this.getAltura()/2;
		this.setArea(newArea);
		System.out.printf("A = %.2f\n", this.getArea());
		}
	public double getbm() {
		return b;
	}
 
	public void setbm(double b) {
		this.b = b;
	}
 
	public double getBM() {
		return B;
	}
 
	public void setBM(double B) {
		this.B = B;
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
