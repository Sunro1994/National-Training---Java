package loop;

import java.util.Scanner;

public class Ex09 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int total=0;
	int input;
	
	do {		//일단 한 번 실행하고
		System.out.println("정수 입력 : ");
		input = sc.nextInt();
		total += input;
	}while(input !=0);		//이후 조건을 체크하여 반복여부를 결정한다.
	
	System.out.println("합계 : " + total);
	sc.close();
}
}
