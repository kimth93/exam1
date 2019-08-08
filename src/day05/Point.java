package day05;

public class Point {
	private int x;
	private int y;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point p = (Point)obj;
			if(x == p.x && y == p.y) {
				return true;
			}
		}
		return false;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

}
