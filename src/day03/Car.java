package day03;

public class Car {
	String name;
	int speed;
	static int numberOfCars;
	
	//static String ������;
	
	public Car() {
		name="mycar";
		speed = 0;
		numberOfCars++;
		
		//this("�̸�����",0);
		//System.out.println("Car()������ ����");
		
	}
	
	/*public Car(String name){
		this(name,0);
		System.out.println("Car(string name)������ ����");
		//this.name=name;
	}*/
	
	/*public Car(String name, int speed) {
		//this(name); �� name ����
		System.out.println("Car(string name,int speed)������ ����");
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
