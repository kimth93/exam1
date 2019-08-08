package day07;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileList {

	public static void main(String[] args) {
		//파일에서 한줄 씩 읽어서 리스트 저장
		FileInputStream fis = null;
		List<String> list = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader("src/day07/IoExam01.java"));
				) {
				String line = null;
				while((line=br.readLine())!= null) {
					list.add(line);
				}
		}catch (Exception e) {
			e.printStackTrace();
		}
		for(String str : list) {
			System.out.println(str);
		}

	}

}
