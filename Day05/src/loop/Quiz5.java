package loop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;




public class Quiz5 {
	public static void main(String[] args)  {
		int cnt = 0;
		Scanner sc= new Scanner(System.in);
		//입력
		System.out.println("정수를 입력하세요 : ");
		String [] n1 = sc.nextLine().split("");
		//배열 생성
		Stack s = new Stack();
		
		//stack에 저장
		for(int i=n1.length-1; i>=0; i--) {
			s.push(n1[i]);
			cnt++;
			if(cnt == n1.length) continue;
			else if(cnt%3==0) s.push(",");
		}
		
		
		
		int s_l = s.size();
		//뒤집음
		ArrayList<String> answer1 = new ArrayList<>();
		for(int j=0; j<s_l;j++) {
			answer1.add((String) s.pop());
			System.out.print(answer1.get(j));
		}

		
		
		
		
		
		
		//정수를 차례대로 뒤집어서 새로운 정수를 만드는데 세자리가 들어갈 때 마다 ,를 사이에 추가한다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}
