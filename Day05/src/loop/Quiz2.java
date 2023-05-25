package loop;

public class Quiz2 {
public static void main(String[] args) {
	// 1부터 100사이의 정수를 반복하여
	// 홀수의 합과 짝수의 합을 각각 구하여 출력하세요
	
	int cnt =1 ;
	int odd_sum = 0;
	int even_sum = 0;
	while(cnt <=100) {
		
		if(cnt %2 ==0|| cnt %6 ==0)
			even_sum += cnt;
		else odd_sum += cnt;
		
		
		cnt ++;
		
	}
	System.out.println("odd_sum : " +odd_sum);
	System.out.println("even_sum : " + even_sum);
}
}
