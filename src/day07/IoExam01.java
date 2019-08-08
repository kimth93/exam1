package day07;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoExam01 {

	public static void main(String[] args) throws Exception{
		//키보드로부터 한줄 씩 입력
		//키보드 System.in
		//한줄씩 BufferedReader -> readLine()메서드
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = null;
		//파일에 출력하고 싶다.
		FileWriter fw = new FileWriter("name.txt");
		
		for(int i=0; i<5; i++) {
			System.out.println("이름을 입력하세요.");
			try {
					name = br.readLine();	//예외처리 throws
					fw.write(name);
			} catch (IOException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println();
		
		
		
		
		
		fw.close();

	}

}
