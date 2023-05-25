package function;

public class Ex07 {
	static int getTotal(int...args) {
		int total = 0;
		for(int num : args) {
			total += num;
		}
		return total;
	}
	public static void main(String[] args) {
		
		
//		System.out.printf(format, args) // 여기서 args >> Object... args로 개수가 정확히 정해지지 않은 가변인자이다
//		가변인자는 매개변수 중에 무조건 가장 뒤에 있어야 한다.
		//가변인자 활용 예시
		System.out.println(getTotal(1,2,3));
		System.out.println(getTotal(10,20,30,40,50));
		System.out.println(getTotal(3,5));
	}

}
