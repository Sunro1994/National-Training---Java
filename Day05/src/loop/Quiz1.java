package loop;

import java.util.Scanner;

public class Quiz1 {
public static void main(String[] args) {
	// 정수를 하나 입력 받아서, 1부터 입력받은 정수까지 한 줄에 출력하는 코드를 작성하세요
	
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 하나를 입력하세요 :");
	int count = sc.nextInt();
	int num =1;
	while(num <= count) {
		System.out.print(num+ "/");
		num++;
	}
	
	System.out.println("\n프로그램 종료");
			
	sc.close();;
	
	
	
	
	
}
}
