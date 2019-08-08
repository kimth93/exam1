package day07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExam03 {

	public static void main(String[] args) {
		FileInputStream fis = null; 	//���ε���
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("src/day07/IoExam01.java");
			fos = new FileOutputStream("IOexam.txt");
			
			byte[] b = new byte[512];	//�ü���� �ѹ��� �� �� �ִ� ��ŭ �����ϴ� ���� ����
			int n;
			int count = 0;
			while((n=fis.read(b))!= -1) {
				fos.write(b,0,n);
				count++;
	
			}
			System.out.println("�� ���� Ƚ��:"+count);
			
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
