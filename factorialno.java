import java.util.Scanner;
public class factorialno {
public static void main(String []args){
	int a,fact=1;
	Scanner input=new Scanner(System.in);
    a=input.nextInt();
    for(int i=1;i<=a;i++){
    	fact=fact*i;
    }
    System.out.println(fact);
	}
}
