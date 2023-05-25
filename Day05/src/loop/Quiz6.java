package loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;




public class Quiz6 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n1;
		String n2 ="";
		String tmp ="";
		
		System.out.println("입력 : ");
		n1 = sc.nextInt();
		
		int cnt = 0;
		while(n1 != 0) {
			if(cnt%3 ==0 && cnt !=0) {
				tmp += ",";
			}
			cnt ++;
			
			tmp += n1 %10;
			n1 /=10;
		}
		System.out.println("tmp :" + tmp);
		
		int i = tmp.length()-1; 	// 인덱스는 0 부터 시작하기 때문에 -1이 마지막 값이다.
		while( i != -1) {	//9, 8, 7, 6, 5, 4, 3 ,2 ,1 ,0 까지
			System.out.print(tmp.charAt(i));
			i--;
		}
		
		
		
		sc.close();
	}
}
