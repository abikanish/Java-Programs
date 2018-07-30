import java.util.Scanner;
public class amstrongno {
public static void main(String []args){
	int a,b,result = 0,count=0;
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	b=input.nextInt();
   for(int i=a+1;i<b;i++){
	   result=0;
	   count=0;
		int x=i;
			while(x!=0){
			x=x/10;
			count++;
			}
			int y=i;
			while (y!=0){
				int abi=y%10;
			    y=y/10;
			 result+=(int) Math.pow(abi,count);
			}
			if(result==i){
				System.out.println(i);
			}
		}
	}
}
