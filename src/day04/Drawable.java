package day04;

public interface Drawable {
	default int exec(int i, int j) {
		return i + j;
		
		
	}
	
	static void sm() {
		System.out.println("staic");
		
	}
	
	
	public void draw(); 	//abstract 키워드로 지정하지 않더라도 자동 추상화

}
