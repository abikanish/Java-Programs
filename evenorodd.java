import java.util.Scanner;
public class evenodd {
public static void main(String []args){
	int a;
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	if(a%2==0){
		System.out.println("even");
		}
	else if(a%2!=0){
		System.out.println("odd");
	}
	else{
		System.out.println("invalid");
	}
}
}
