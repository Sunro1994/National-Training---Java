package function;

import java.util.Scanner;

public class Quiz2 {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//1 ) 정거장 구간 수에 따른 걸린 시간을 문자열로 반환하기
	// (구간당 4분으로 계산, 60분을 초과하면 시간과 분으로 구분하여 반환하기)
	System.out.print("정거장 수 를 입력하세요 :");
	int num = sc.nextInt();
	
	System.out.println("문제1) 걸린 시간 : "+ passTime(num));
	
	System.out.println("================다음 문제 ==============");
	
	
	
	//2) 놀이기구 이용시간에 따른 요금을 문자열로 반환하기
	// (천단위 구분기호를 찍어서 처리해야함)
	//기본 30분까지는 3천원, 이후 10분당 500원 추가 요금 발생
	// (천단위구분기호를 찍어서 처리해야함)
	System.out.println("놀이기구 이용시간을 적어주세요: ");
	int playTime = sc.nextInt();
	
	System.out.printf("문제2) 비용 :%,d 원",PayMoeny(playTime));
	
	//3) 두 정수를 전달받아서, 두 정수 사이의 모든 수의 합을 구하여 반환하기
	// (두 정수의 대소관계는 정해져 있지 않음)
	
	
	System.out.println("================다음 문제 ==============");
	System.out.println("두 수를 입력하세요");
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	
	System.out.println("두 수의 합 : "+ addNum(number1,number2));
	
	
	}
	
	  static int PayMoeny(int playTime) {
	
	int pay = 3000;
	int result = 0;
	if(playTime > 30 && playTime%10 ==0) result = pay + ((playTime%30)/10)*500;
	else result = pay +(((playTime-30)/10)+1)*500;
		  
		  
		return result;
	}

	static String passTime(int num) {
		int time = num * 4;
		int hour =0, minute = time;
		if(time>60) return String.format("%02d : %02d", time/60,time%60);
		
		 return String.format("%02d",time);
	}
	
	static int addNum(int number1, int number2) {
		int max = Math.max(number1, number2);
		int min = Math.min(number1, number2);
		
		
		
		int result = 0;
		for(int i=min ; i<=max; i++) {
			result += i;
		}
		
		return	result;
	}
	
	
	
}
