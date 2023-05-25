package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz4 {
public static void main(String[] args) {
	// 랜덤을 활용한 업다운 게임을 작성하세요
	Scanner sc = new Scanner(System.in);
	
	Random ran = new Random();
	int answer = ran.nextInt(10)+1;
	int count=0;
	
	System.out.println("정답을 입력하세요(1~10) : ");

	while(true) {
		int num = sc.nextInt();
		if (num == answer ) {
			System.out.println("정답입니다."+count+"회 만에 맞추셨습니다."); 
			break;
			}//if
		System.out.println(num < answer ? "Up": "Down");	
		count++;
		}//while		
	}//main

}
