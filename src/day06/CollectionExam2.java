package day06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionExam2 {
	
	public static void test(List<String> list) {
		
		
	}	//다 들어간다
	
	public static void test(ArrayList<String> list) {
		
		
	} 	//array만 들어간다
	
	public static void main(String[] args) {
		List<String> stringList = null;
		LinkedList<String> list = new LinkedList<>();
		ArrayList<String> alist = new ArrayList<>();
		test(stringList);
		test(list);
		test(alist);
		
		
		Set<String> nameSet = new HashSet<>();	//set은 중복값을 허용하지 않는다.
		nameSet.add("kang");
		nameSet.add("kim");
		nameSet.add("kang");
		System.out.println(nameSet);
		
		List<Ball> ballList = new ArrayList();
		ballList.add(new Ball(1));
		ballList.add(new Ball(2));
		ballList.add(new Ball(1));
		ballList.add(new Ball(2));
		
		System.out.println(ballList);
		
		Set<Ball> ballSet = new HashSet();
		ballSet.add(new Ball(1));
		ballSet.add(new Ball(2));
		ballSet.add(new Ball(1));
		ballSet.add(new Ball(2));
		System.out.println(ballSet);
		
		for(Ball ball : ballSet) {
			System.out.println(ball);
			
		}
		
		Iterator<Ball> iter = ballSet.iterator(); //Set을 순서대로
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
		
	}

}
