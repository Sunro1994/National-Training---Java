package function;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int[] arr= {1,4,14};
		
//		for(int i =0; i<arr.length; i++) {
//			arr[i] = ran.nextInt(15) +1;
//		}
		System.out.println(Arrays.toString(arr));
	
			
		//3대의 엘리베이터가 있다.
		//사용자에게 현재 층수를 입력받아서 가장 가까운 엘리베이터가 움직이도록 출력하세요
		//처음부터 순서대로, 엘리베이터의 이름을 A, B, C라고 하면
		//%s 엘리베이터가 이동합니다 라고 출력해야 합니다.
		int num=16;
		
		Elevator(arr, num);
		
		
		
		
		
		sc.close();
	}// main
	
	static void Elevator(int[] arr, int num) {
		int[] absArr= new int[arr.length];
		 
		//(현재층 - 엘레베이터층)결과의 절대값 배열을 생성
		for(int i=0; i<absArr.length;i++) absArr[i] = Math.abs(num-arr[i]);
		
		int closeToNum=absArr[0];
		
		for(int i=1; i<absArr.length;i++) 	{if(absArr[i]<closeToNum) closeToNum= i+1;}
		
		System.out.println((char)('A'+closeToNum)+"엘리베이터가 이동합니다.");
		}//Elevator

		
	}
	
	

