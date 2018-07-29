import java.util.Scanner;
public class ntimes {
public static void main(String []args){
	String s="Hello";
	int n;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	for(int i=0;i<n;i++){
		System.out.println(s);
	}
}
}
