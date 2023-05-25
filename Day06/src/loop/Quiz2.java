package loop;

import java.util.Scanner;

// 사용자에게 1~100 사이 정수를 입력받아서
// 퍼센트에 맞게 환산하고
// 전체 길이에서 입력한 수치 이전은 #을 출력하고
// 이후는 공백을 출력한다.
// 단, 항상 가운데에는 입력한 수치를 %형태로 출력해야 한다.

// [##########               20%] 

public class Quiz2 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("정수 입력 : ");
	
	int num = sc.nextInt();
	int result = (num*100/50);
	
	
	System.out.print("[");
	
	
	for(int i=1; i<=50; i++) {
		if(i==25) System.out.printf(" %02d %% ",result);
		else if(i<=num) System.out.print("#");
		else {System.out.print(" ");
		}
		
		
	}
	System.out.println("]");
	System.out.println();
	System.out.println("끝");


	sc.close();
	
}
}

