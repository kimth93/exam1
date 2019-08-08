package day06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentTest {
	public static void printStudent(Map<String, Student> studentMap) {
		System.out.println(studentMap);
		
	}

	public static void main(String[] args) {
		Map<String, Student> studentMap = new HashMap<>(); 	//student ¹Ş¾Æ¿È
		studentMap.put("Kim", new Student(50, 90, 40, "kim"));
		studentMap.put("Lee", new Student(80, 90, 10, "lee"));
		studentMap.put("Shin", new Student(90, 90, 100, "shin"));
		studentMap.put("Kang", new Student(30, 40, 50, "kang"));
		studentMap.put("Park", new Student(50, 60, 40, "park"));
		
		System.out.println(studentMap);
		System.out.println(studentMap.get("Kim"));
		
		Set<String> keys = studentMap.keySet();
		for(String key : keys) {
			System.out.println(studentMap.get(key));
		}
		
		

	}

}
