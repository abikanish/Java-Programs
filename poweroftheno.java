import java.util.Scanner;
public class poweroftheno {
public static void main(String []args){
	int num,pow;
	int result;
	Scanner input=new Scanner(System.in);
	num=input.nextInt();
	pow=input.nextInt();
	result=(int) Math.pow(num,pow);
	System.out.println(result);
}
}
