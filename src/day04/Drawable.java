package day04;

public interface Drawable {
	default int exec(int i, int j) {
		return i + j;
		
		
	}
	
	static void sm() {
		System.out.println("staic");
		
	}
	
	
	public void draw(); 	//abstract Ű����� �������� �ʴ��� �ڵ� �߻�ȭ

}
