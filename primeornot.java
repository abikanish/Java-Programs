import java.util.Scanner;
public class primeornot {
public static void main(String []args){
	int num,count=0;
	Scanner input=new Scanner(System.in);
	num=input.nextInt();
	for(int i=1;i<=num;i++){
		if(num%i==0){
			count++;
		}
	}
		if(count==2){
			System.out.println("prime");
		}
		else{
			System.out.println("Not prime");
		}
	}
}
