package loop;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {
public static void main(String[] args) {
	//횟수가 일정하지 않거나, 가늠하기 어려운 반복
	
	Random ran = new Random();
	Scanner sc = new Scanner(System.in);
	int num = ran.nextInt(6)+1;
	int answer = 0;
	int cnt=0;
	
	
	System.out.println("1에서 6사이에 랜덤값을 맞춰보세요 : ");
	answer = sc.nextInt();
	cnt++;
	
	while(answer != num) {
		System.out.println("틀렸습니다. 다시 시도 :");
		answer = sc.nextInt();
		cnt++;
	}
	
	System.out.println(cnt + "번만에 정답입니다.");
	sc.close();
}
}
