package function;

public class Ex06 {
	public static void main(String[] args) {
		
		System.out.println(args.length); //0
		
		
		for(int i=0;i<args.length;i++) {
			System.out.printf("args[%d] : %s\n" , i , args[i]);
		}
		System.out.println();
		
//		String[] args 는  입력하는 내용을 String배열,공백을 기준으로 입력받아 처리한다.
		
		String a = "hello world";
		
//		lower case, upper case
		if(args.length >0 ) {
			
			switch(args[0]) {
			
			case "/l" : System.out.println("hello world"); break;
			case "/u" : System.out.println("HELLO WORLD"); break;
			default:	System.out.println("Hello World"); break;
			
			}
		}
		System.out.println("끝");
		
		
		
		
		
		
		
	}
}
