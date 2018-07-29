import java.util.Scanner;
public class sumofkintegers {
public static void main(String []args){
	int n,k,i,j,sum=0;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
	k=input.nextInt();
	for( i=1;i<=n;i++){
		System.out.print(" "+i);
	}
	for(j=1;j<=k;j++){
		sum=sum+j;
		}
	System.out.println();
	System.out.println(sum);
}
}
