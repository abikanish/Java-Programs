import java.util.Scanner;
public class amstrongnoo {
public static void main(String []args){
	int a,result = 0,count=0;
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	int c=a;
	while(a!=0){
		a=a/10;
		count++;
	}
	int d=c;
	while(c!=0){
		int abi=c%10;
		c=c/10;
		result+=(int)Math.pow(abi,count);
		}
	if(result==d){
		System.out.println("yes");
	}
	else{
		System.out.println("No");
	}
}
}
