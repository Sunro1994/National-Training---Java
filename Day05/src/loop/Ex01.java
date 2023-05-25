package loop;



public class Ex01 {
public static void main(String[] args) {
	
	int num = 10;
	
	if(num < 20 ) {		// 조건이 참이면, 종속문장을 한 번만 실행한다.
		num +=1;
		System.out.println("if) num : "+ num);
	}
	
	while(num < 20) {	// 조건이 참이면, 종속문장을 실행하고
		num +=1;
		System.out.println("while) num : "+num);
		// 다시 조건절로 돌아가서 조건을 체크한다.
	}
	

	
}
}
