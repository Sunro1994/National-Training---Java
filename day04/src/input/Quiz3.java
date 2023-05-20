package input;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		// 클래스 자료형이 import 되지 않아서 빨간줄이 생겼다면
		// 클래스 가장 오른쪽에 커서를 두고 자동완성 (ctrl + space)
		
		// 이름(문자열), 나이(정수), 키(실수, cm), 몸무게(실수, kg)로 입력받습니다
		// 입력받은 값에서 체질량지수(BMI)를 구합니다
		// bmi 는 근육량, 유전적 원인, 개인적차이를 반영하지 못하는 단점이 있습니다 
		
		// bmi = 몸무게(kg) / 키(m) * 키(m)
		// ~ 18.5 		저체중
		// 18.5 ~ 23	정상
		// 23 ~ 25		과체중
		// 25 ~ 		비만
		
		// 이름과 나이, BMI지수를 화면에 출력합니다
		// 단, bmi지수는 소수점 이하 둘째자리까지 출력하면 됩니다
		
		// 1) 코드에서 사용할 변수를 상단에 한번에 선언한다
		// 초기값을 지정할 수 있다면, 초기화한다
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		double height, weight, bmi;
		
		// 2) 값이 할당되지 않은 변수 중에서 입력받아야 하는 값을 입력받는다
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		
		System.out.print("나이 입력 : ");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.print("키 입력 (cm) : ");
		height = Double.parseDouble(sc.nextLine());
		
		System.out.print("몸무게 입력 (kg) : ");
		weight = Double.parseDouble(sc.nextLine());
		
		// 3) 입력받은 값을 기반으로 연산을 수행하여 다른 변수의 값을 채워넣는다
		// 연산 시 단위 변환에 유의하면서 진행하기 !!
		height /= 100;
		bmi = weight / (height * height);
		
		// 4) 모든 값이 준비되면 출력한다 (필요하다면 서식을 활용한다)
		System.out.println();
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d살\n", age);
		System.out.printf("BMI : %.2f\n", bmi);
		
		// 5) 결과 처리 이후 마무리 코드를 수행하고 종료한다
		sc.close();
	}
}
