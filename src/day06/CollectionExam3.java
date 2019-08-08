package day06;

import java.util.HashMap;
import java.util.Map;			//toString 오버라이드
import java.util.Set;
import java.util.Stack;

public class CollectionExam3 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "kang");
		map.put(2, "kim");
		map.put(3, "hong");
		
		System.out.println(map);
		
		map.put(1,"choi");
		
		System.out.println(map);
		
		System.out.println(map.get(1));
		System.out.println(map.get(3));
		System.out.println("==================");
		
		Set<Integer> keys = map.keySet();		//순서를 보장하지 않는다.
		for(Integer key : keys) {
			System.out.println(map.get(key));
			
		}
		
		/*Stack<String> stack = new stack<>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push("e");
		System.out.println(stack);
		*/
	}
	
}
