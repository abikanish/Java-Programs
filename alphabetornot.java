import java.util.Scanner;
public class alphabetornot {
public static void main(String []args){
	char c;
	Scanner input=new Scanner(System.in);
	c=input.next().charAt(0);
	if((c>=65&&c<=90)||(c>=97&&c<=122)){
		System.out.println("alphabet");
	}
	else{
		System.out.println("not an alphabet");
	}
}
}
