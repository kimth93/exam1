package day04;

public class Rectangle extends Shape implements Drawable {
	
	private int w;
	private int h;
	
	
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public double calculateArea() {
		return (double)w*h;
	}

	@Override
	public void draw() {
		System.out.println("³×¸ð");
		
	}
	

}
