package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Qiuz3 {

	public static void main(String[] args) {
		Random ran = new Random();
		int size =10;
		int range = 100;
		int[] arr = new int[size];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = ran.nextInt(range)+1;
		}
		
		
		
		System.out.println(arr);						// 해쉬코드가 나온다.
		System.out.println(Arrays.toString(arr));		// 배열을 문자열로 알아볼 수 있게끔 표시해준다.
		
//		1) arr의 값에서 홀수와 짝수가 각각 몇개인지 파악하여 출력하세요
		int odd=0;
		int even= 0;
		for(int i =0; i<arr.length;i++) {
			if (arr[i]%2 != 0) odd++;
			else even++;
		}
		System.out.println("odd :"+ odd);
		System.out.println("even :"+ even);
//		2) oddArray와 evenArray를 생성하여 각각 홀수와 짝수를 담아서 출력하세요
		
		
		//1번째 방법
		ArrayList<Integer> oddArray = new ArrayList<>();
		ArrayList<Integer> evenArray = new ArrayList<>();
		
		for(int i =0; i<arr.length;i++) {
			if (arr[i]%2 ==0 || arr[i]%6==0) evenArray.add(arr[i]);
			else oddArray.add(arr[i]);
		}
		
		System.out.println("홀수의 합 : ");
		for(int i : oddArray) System.out.print(+i+" ");
		
		System.out.println("\n짝수의 합 : ");
		for(int i : evenArray) System.out.print(+ i+ " ");
		
		System.out.println();
		
		
		//2번째 방법
		int index1 = 0;
		int index2 = 0;
		
		
		int[] arr1 = new int[odd];
		int[] arr2 = new int[even];
		for(int i =0; i<arr.length;i++) {
			if(arr[i]%2 ==0) arr2[index1++] = arr[i];
			else arr1[index2++] = arr[i];
			
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
//		3) arr의 총합을 구하여 출력하세요
		int answer = 0;
		for(int i : arr) answer += i;
		System.out.println("arr의 총합 : "+ answer);
		
	}

}
