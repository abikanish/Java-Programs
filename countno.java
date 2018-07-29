import java.util.Scanner;
public class count {
public static void main(String []args){
	int a;
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	int n=0;
	while(a!=0){
		a=a/10;
		n=n+1;
	}
	System.out.println(n);
}
}
