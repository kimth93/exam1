package day05;

public class Circle {
	private int x;
	private int y;
	private int radius;
	
	public Circle (int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle a = (Circle)obj;
			Circle b = (Circle)obj;
			if(a.radius == b.radius) {
				System.out.println("r");
			}
		}
		return false;
	}
	
	

}
