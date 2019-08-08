package day06;

public class Student {
	
	private int korean;
	private int math;
	private int english;
	private String name;
	
	public Student(int korean, int math, int english, String name) {
		this.korean = korean;
		this.math = math;
		this.english = english;
		this.name = name;
		
	}

	@Override
	public String toString() {
		return "Student [korean=" + korean + ", math=" + math + ", english=" + english + ", name=" + name + "]";
	}
	

}
