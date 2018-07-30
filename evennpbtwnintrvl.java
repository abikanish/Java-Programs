import java.util.Scanner;
public class evennumbtwintrvl {
	public static void main(String []args){
		int a,b;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		for(int i=a+1;i<b;i++){
			if(i%2==0){
				System.out.print(" "+i);	
			}
		}
	}
	}
