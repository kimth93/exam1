package day04;

public class Circle extends Shape implements Drawable {
	
	private double r;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public double calculateArea() {
		return (double)r*r*Math.PI;
	}

	@Override
	public void draw() {
		System.out.println("¿ø");
		
	}

}
