package exClassAbstrata;

public class Losango extends FormaGeometrica {
	private double d;
	private double D;
	private double area;

	public Losango(double d, double D) {
		this.setdm(d);
		this.setDM(D);
		this.setArea(0);
	}

	@Override
	public void formula() {
		System.out.printf("Fórmula do Losango: A = (%.2f * %.2f)/2\n", this.getDM(), this.getdm());
	}

	@Override
	public void area() {
		double newArea = (this.getDM() + this.getdm()) / 2;
		this.setArea(newArea);
		System.out.printf("A = %.2f\n", this.getArea());
	}

	public double getdm() {
		return d;
	}

	public void setdm(double d) {
		this.d = d;
	}

	public double getDM() {
		return D;
	}

	public void setDM(double D) {
		this.D = D;
	}

	public double getArea() {
		return area;
	}

	private void setArea(double area) {
		this.area = area;
	}
}
