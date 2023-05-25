package loop;

public class Ex06 {
	static int checkNumber(int num) {
		String value = num + " ";
		int answer = 0;
		
		for(int i=0; i<value.length(); i++) {
			char ch = value.charAt(i);
			if(ch == '3' || ch =='6' || ch == '9') {
				answer +=1;
			}
		}
		
		
		return answer;
	}
public static void main(String[] args) {
	// f5 : step into , 해당 함수 내부로 진입하여 디버깅을 계속 진행한다.
	// f6 : step over , 해당 함수로 진입하지 않고, 함수의 결과만 받아서 계속 진행한다.
	int num =1; 	//반복 시작값
	while(num <=50) { //1~50
		int cnt = checkNumber(num);
		for(int i=0;i<cnt;i++) {
			System.out.print(num +" 👌 ");
		
	}
		if(cnt ==0) {
			System.out.print(num);
		}
		System.out.println();
		num +=1;
	}
	System.out.println("끝!");
}
}
