package function;

public class Ex04 {
	public static void main(String[] args) {
		//1) 정수를 하나 전달받아서 절대값을 반환하는 함수
		int t1 = getAbsolute(5-7);
		
		System.out.println("t1: "+t1);
		//2) 새 정수를 전달받아서 최소값을 반환하는 함수
		int t2 = getMinValue(7,2,5);
		
		System.out.println("t2: "+t2);
		
		//3) 길이가 3인 배열을 전달받아서 최소값을 반환하는 함수
		int[] arr = {7,2,5};
		int t3 = getMinValue(arr);
	
		System.out.println("t3: "+t3);
	}
	
	
	private static int getAbsolute(int i) {
//		if (i<0) return -i;
		return Math.abs(i);
	}
	
	private static int getMinValue(int i, int j, int k) {
		int min = Math.min(i, j);
		min = Math.min(j, k);
		
		// int min = i;
//		return (i<j) ? i : j<k ? j:k;
		return min;
	}
	
	private static int getMinValue(int[] arr) {
		
		int min =arr[0];
		
		for(int i : arr) if(i<min) min =i;
		
		return min;
	}

	//하나의 함수이름으로, 여러개의 함수정의를 별도로 만들 수 있다.
	// 함수 오버로딩, 메서드 오버로딩
	// 구분 기준 : 함수이름 + 매개변수의 자료형, 개수, 순서
	

	

}
