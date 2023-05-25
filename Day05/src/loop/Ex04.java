package loop;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws IOException{
		
		
		String fileName = "src/loop/Ex01.java";
		Scanner sc = new Scanner(new File(fileName));	//파일을 읽어내는 스캐너
		int cnt =0;
		
		while(sc.hasNextLine()) {
			cnt += 1;
			String line = sc.nextLine();
			System.out.printf("%d : %s \n",cnt,line);
		}
		sc.close();
		
		//for 과 while의 차이
		// for은 횟수가 정해져 있다.
		// while은 
	}
}
