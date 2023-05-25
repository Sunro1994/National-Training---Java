package loop;

public class Ex05 {
public static void main(String[] args) {
	
		// 다음 모양의 문자열을 만들어서 화면에 출력하세요
	
		// ====*====*====*====*====
		String a = "=";
		String b = "*";
		String answer = "";
		
		
		for(int i=1; i<=24;i++) {
			
			if(i%5==0) answer +=b;
			else answer +=a;
}
		System.out.println(answer);
		
		
}
}
