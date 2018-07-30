import java.util.Scanner;
public class primenumbtwintrvl {
public static void main(String []args){
	int a,b,count=0,j,i,k;
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	b=input.nextInt();
    for( i=a+1;i<b;i++){
    	count=0;
		for(j=1;j<=i;j++)
		if(i%j==0){
			count++;
		}
	   if(count==2){
			System.out.println(" "+i);
		}
	}
}
}
