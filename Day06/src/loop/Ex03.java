package loop;

public class Ex03 {
	public static void main(String[] args) {
		
		
		// 1) 1부터 100 사이의 홀수의 합과 짝수의 합을 for문으로 계산하여 출력하세요
			int oddSum =0;
			int evenSum =0;
			for(int i=1; i<=100;i++ ) {
				if(i%2==0 || i%6==0) evenSum += i;
				else oddSum +=i;
			}
			System.out.println("evenSum : " +  evenSum );
			System.out.println("oddSum : " +  oddSum );
			
			
		// 2) A부터 Z까지 띄어쓰기로 구분하여 한 줄에 출력하세요
		
		for(int j=65; j<=90; j++) {		//char j='A'도 가능
			System.out.print((char)j + " ");
		}
		System.out.println();
		
		// 3) 빈 문자열에 * 기호를 5번 추가하여 출력하세요
			String answer = "";
			for(int k=0;k<5;k++) {
				answer += "*";
			}
			System.out.println(answer);
	}
}
