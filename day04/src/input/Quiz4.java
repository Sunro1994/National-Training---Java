package input;

import java.util.BitSet;
import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 생년월일을 8자리 정수로 입력받아서
		// 올해연도를 이용하여 나이를 계산하여 출력하기
		// 출생 : yyyy-MM-dd
		// 나이 : x살
		
		int currentYear = 2023;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생년월일(ex :2022-09-20)을 입력하세요 :");
		String birth = sc.nextLine();
		while(birth.length()!=10) 
			{System.out.println("양식에 맞게 입력해주세요\n 생년월일(ex :2022-09-20) :");
		birth = sc.nextLine();}
		
		String year = birth.substring(0, 4);
		String month = birth.substring(5,7);
		String day= birth.substring(8);
		
		int age = currentYear - Integer.parseInt(year);
		
		System.out.printf(" 출생 : %s-%s-%s",year,month,day);
		
		System.out.println("(만)나이 : "+ age);
		
		
	}
}
