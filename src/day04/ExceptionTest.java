package day04;

public class ExceptionTest {
	
	public static void main(String[] args) {
		int a = 7;
		double b = 0;
		
		int[] iarr = new int[5];
		
		try {
			System.out.println(iarr[0]);
			System.out.println("여기는 예외처리");
			
			b = 100 /a;
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println(e);
		}catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			a=1;
			b=100/a;
		}catch (Exception e) {
			System.out.println("여기서 예외처리");
		}finally {
			System.out.println("반드시 실행");
		}
		
	}

}
