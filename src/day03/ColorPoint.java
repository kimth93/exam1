package day03;

public class ColorPoint extends Point {
	public ColorPoint(int x, int y, String string) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	private String color;
	
	public void show() {
		System.out.printf("��ǥ [x=%d,y=%d,color=%s]�� ���� �׷Ƚ��ϴ�.\n",x,y,color);
		
	}
	
	
	
}
