package loop;

public class Ex04 {
public static void main(String[] args) {
//	System.out.printf("%d x %d = %2d\n", 3, 1, 3*1);
//	System.out.printf("%d x %d = %2d\n", 3, 2, 3*2);
//	System.out.printf("%d x %d = %2d\n", 3, 3, 3*3);
//	System.out.printf("%d x %d = %2d\n", 3, 4, 3*4);
//	System.out.printf("%d x %d = %2d\n", 3, 5, 3*5);
//	System.out.printf("%d x %d = %2d\n", 3, 6, 3*6);
//	System.out.printf("%d x %d = %2d\n", 3, 7, 3*7);
//	System.out.printf("%d x %d = %2d\n", 3, 8, 3*8);
//	System.out.printf("%d x %d = %2d\n", 3, 9, 3*9);
	
	
	//위 코드를  for문을 이용하여 새로 작성해보세요
	// 필요한 변수가 있다면 추가로 선언하여도 됩니다.
	int num =3;
	for(int i=1; i<=9;i++) {
		System.out.printf("%d * %d = %d \n", num,i,num*i);
	}
}
}
