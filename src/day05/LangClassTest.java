package day05;

public class LangClassTest {

	public static void main(String[] args) {
		Point p = new Point(2,3);
		
		System.out.println( p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p.equals(p));
		System.out.println(p);

	}

}
