package day07;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoExam01 {

	public static void main(String[] args) throws Exception{
		//Ű����κ��� ���� �� �Է�
		//Ű���� System.in
		//���پ� BufferedReader -> readLine()�޼���
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = null;
		//���Ͽ� ����ϰ� �ʹ�.
		FileWriter fw = new FileWriter("name.txt");
		
		for(int i=0; i<5; i++) {
			System.out.println("�̸��� �Է��ϼ���.");
			try {
					name = br.readLine();	//����ó�� throws
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
