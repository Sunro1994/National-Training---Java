package loop;

public class Ex01 {
// for : 일정한 횟수만큼 반복할때 주로 사용한다.
	public static void main(String[] args) {
		for(int i =0; i<5; i++) {		//0, 1, 2, 3, 4, 5
			System.out.println("Hello !!");
		}
		System.out.println();
		
		int cnt = 0;
		while (cnt < 5) {
			System.out.println("java");
			cnt++;
		}
		System.out.println();
	}
}
