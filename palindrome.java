import java.util.Scanner;
public class palindrome {
public static void main(String []args){
	int a;
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	String s=String.valueOf(a);
	StringBuffer sb=new StringBuffer(s);
	sb=sb.reverse();
	String s1=new String(sb);
	if(s.equalsIgnoreCase(s1)){
		System.out.println("Palindrome");
	}
	else{
		System.out.println("Not a palindrome");
	}
}
}
