package array;

public class Ex08 {
	public static void main(String[] args) {
		
		int n1 = -5, n2 =12, n3 =4;
		int max ;
		
		max = n1;
		if(max <n2) max =n2;
		if(max < n3) max = n3;
		System.out.println("max : "+ max);
		System.out.println();
		int[] arr= { 17,26,33,52,46,87,69,92,73};
		for(int i =0 ; i<arr.length;i++) {
			if(max < arr[i]) max = arr[i];
		}
		System.out.println("max : "+ max);
		System.out.println();
		
		
		// 1) arr의값 중에서, 홀수이면서 가장 큰 값을 찾아서 출력하세요
		int oddMax=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2!=0 &&  oddMax<arr[i] ) oddMax=arr[i];
		}
		System.out.println("1번문제 : "+oddMax);
		
		//2) arr 의값중, 짝수인 값의 합
		int evenSum = 0;
		for(int i: arr) if(i%2==0) evenSum+=i;
		System.out.println("2번 문제 :"+ evenSum);
		
		//3) arr의 모든 값의 평균
		int totalSum = 0;
		for(int i : arr) totalSum += i;
		System.out.println("3번 문제 : "+ totalSum/arr.length);
		
		
		
		
		
		
	}
}
