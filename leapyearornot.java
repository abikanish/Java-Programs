import java.util.Scanner;
public class leapyear {
public static void main(String []args){
	int a;
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	if(a%4==0){
		System.out.println("Leap year");
	}
	else{
		System.out.println("not a leap year");
	}
}
}
