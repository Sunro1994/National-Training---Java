package loop;

public class Ex06 {
public static void main(String[] args) {
	
	String str = "";
	String a = "* ";
	String b = "  ";
	
	for(int i=1 ; i<=25; i++) {
		if(i%2==0 || i%6==0) str +=b;
		else str += a;
		
		
		if(i%5 ==0) {
			str +="\n";
		}
				
	}
	System.out.println(str);
}
}
