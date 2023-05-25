package loop;

import java.util.Scanner;

public class Ex111 {

    public static void main(String[] args) {
       
 
    			Scanner sc = new Scanner(System.in);
    			int n1;
    			
    			String tmp ="";
    			String n2 = "";
    			
    			System.out.print("정수입력:");
    			n1= sc.nextInt();
    			
    			while(n1 !=0) {
    				tmp+=n1%10;
    				n1/=10;
    			}
    			System.out.println("tmp : "+ tmp);
    			System.out.println();
    			
    			for(int i=tmp.length()-1; i>=0; i--) {
    				n2 = tmp.charAt(i)+n2;
    				if(i==0) continue;
    				if(tmp.length()%2==0 || tmp.length()%6==0) {
    				if(i%3==0 && i!=tmp.length()-1) {
    					n2 = "," + n2;
    				}
    				}
    				else if((i%3)-1==0 && i!=tmp.length()-1) {
    					n2 = "," + n2;
    				}
    			}
    			
    			System.out.println("n2 : "+n2);

    			String answer = "";
    			for(int j=n2.length()-1; j >=0 ; j--) {
    				answer += n2.charAt(j);
    			}
    			System.out.println("answer : " +answer);
    }
    
    

    	

    }
