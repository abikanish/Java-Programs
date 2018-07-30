import java.util.Scanner;
public class multiplesoffive {
public static void main(String []args){
	int n,multiple=1,n1;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	n1=input.nextInt();
	for(int i=1;i<=n;i++){
	multiple=i*n1;
	System.out.println(multiple);
	}
	}
}
