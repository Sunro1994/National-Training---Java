package function;

import java.util.Scanner;

public class Ex03 {
	
	static int absolute(int num) {
		
		int answer = 0;
		if(num<0) {
			answer = -num;
		}
		else {answer = num;}
		
		return answer;
	}
	//main 함수가 static속성이므로, main에서 바로 호출하려면 함수도 static이어야 한다.
	public static void main(String[] args) {
		//정수를 하나 전달받아서 정수의 절대값을 반환하는 함수
		// int를 하나 전달받아서, int를 반환한다(반환값은 하나만 가능)
//		Scanner sc = new Scanner(System.in);
//		System.out.println(absolute(sc.nextInt()));
		
		//정수로 반지름을 전달받아서, 원의 넓이를 계산하여 반환하는 함수를 작성하세요
		double s1 = getCirclesize(3);
		double s2 = getCirclesize(4);
		System.out.printf("s1 : %.2f\n", s1);
		System.out.printf("s2 : %.2f\n", s2);
		int[] ddd = new int[4];
		
		
		// 두 정수를 전달하여, 큰 값을 반환하는 함수를 작성하세요
		int n1 = getBigNumber(5,3);
		int n2 = getBigNumber(-5,3);
		
		System.out.println("n1 : "+ n1);
		System.out.println("n2 : "+ n2);
		System.out.println();
		
		
	}
	static double getCirclesize(int i) {
		double result = i*i*3.14;
		
		return result;
	}
	static int getBigNumber(int n1, int n2) {
		
		
		return n1>n2 ? n1 : n2;
	}
}
