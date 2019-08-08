package day07;

import java.io.IOException;

public class IOExam02 {
	public static void main(String[] args) {

		try {
			System.out.println("입력");
			System.out.println((char)System.in.read());			//int로 반환
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int bt;
		int count = 0;
		
		try {
			while((bt = System.in.read()) != -1) {
				System.out.print((char)bt);
				count++;
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(count);
		
	}

}
