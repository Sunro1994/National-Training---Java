package loop;

public class Quiz3 {
public static void main(String[] args) {
	/*
	  은행에 돈을 입금한다.
	  첫날에는 10원, 둘째날에는 20원, 셋째날에는 40원
	  이런 식으로 전날의 두배를 준비하여 30일동안 입금한다.
	  입금이 끝나면 은행에 예금된 총 금액은 얼마인지 계산하여 출력하세요
	  출력할 때 printf()의 서식을 활용하여 천단위 구분 콤마를 찍어주세요
	 
	 첫날 : 10	(0*10)
	 둘째날 : 10+  (1* 10)
	 셋째날 : 20 + (2 *10)
	 넷째날 : 40 + (4* 10)
	 5    : 80 + (80)
	 */
	
			int day =1;
			long bank=0;
			long money =10;
			
			while(day<=30) {
				bank += money;
				money *= 2;
				day++;
			}
			
	System.out.println(money);
}
}
