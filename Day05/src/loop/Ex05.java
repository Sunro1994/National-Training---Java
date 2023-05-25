package loop;

public class Ex05 {
	public static void main(String[] args) {
		
		int cnt =0;
		
		while(cnt < 10)  {
			if(cnt %3 == 0) {
				System.out.print(cnt + " ");
			}
			cnt ++;
		}
		System.out.println();
	}
}
