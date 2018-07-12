package abii;
import java.util.Scanner;
public class Charascii {
public static void main(String []args) {
	int a; String str;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the number");
	a=input.nextInt();
	str=Character.toString((char)a);
	System.out.println(str );
	input.close();
}
}
