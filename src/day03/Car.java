package day03;

public class Car {
	String name;
	int speed;
	static int numberOfCars;
	
	//static String 제조사;
	
	public Car() {
		name="mycar";
		speed = 0;
		numberOfCars++;
		
		//this("이름없음",0);
		//System.out.println("Car()생성자 실행");
		
	}
	
	/*public Car(String name){
		this(name,0);
		System.out.println("Car(string name)생성자 실행");
		//this.name=name;
	}*/
	
	/*public Car(String name, int speed) {
		//this(name); 위 name 실행
		System.out.println("Car(string name,int speed)생성자 실행");
	}*/
	
	public void setName(String name) {
		//String local = "test";
		name = name;
		//this.speed = speed;
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setSpeed(int s) {
		speed = s;
	}
	public int getSpeed() {
		return speed;
	}

}
