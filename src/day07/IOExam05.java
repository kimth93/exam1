package day07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IOExam05 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.skuniv.ac.kr/");
		Stack<String> stack = new Stack<>();
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				) {
				String line = null;
				
				for(int i=0; i<5; i++) {
					stack.push(br.readLine());
				}
		}catch (Exception e) {
			e.printStackTrace();
		}try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				) {
			while(stack.empty() != true ) {
				
				System.out.println(stack.pop());
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
