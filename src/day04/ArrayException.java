package day04;
class MyException extends Exception {
	public MyException() {
		super("exception 객체 만들기");
	}
	public MyException(String msg) {
		super(msg);
	}
}

public class ArrayException {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		intArray[0] = 0;
		
		for(int i = 0; i <5; i++) {
			try{
				intArray[i+1] = i+1 + intArray[i];	//i=4인 경우 예외발생
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("intArray["+1+"]" + "="+intArray[i]);
		}
	}
}

