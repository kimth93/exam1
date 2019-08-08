package day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExam03 {

	public static void main(String[] args) {
		FileInputStream fis = null; 	//따로따로
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("src/day07/IoExam01.java");
			fos = new FileOutputStream("IOexam.txt");
			
			byte[] b = new byte[512];	//운영체제가 한번에 쓸 수 있는 만큼 지정하는 것이 좋다
			int n;
			int count = 0;
			while((n=fis.read(b))!= -1) {
				fos.write(b,0,n);
				count++;
	
			}
			System.out.println("총 읽은 횟수:"+count);
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				}catch (IOException e) {
					e.printStackTrace();
					
				}
				
			}
			if(fos != null) {
				try {
					fos.close();
				}catch (IOException e) {
					e.printStackTrace();
					
				}
				
			}
		}

	}

}
