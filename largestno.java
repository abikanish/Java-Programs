import java.util.Scanner;
public class largestno {
public static void main(String []args){
	int a,b,c;
	Scanner input=new Scanner(System.in);
	a=input.nextInt();
	b=input.nextInt();
	c=input.nextInt();
	if((a>b)&&(a>c)){
		System.out.println("Greatest no is:"+a);
	}
	else if((a<b)&&(c<b)){
		System.out.println("Greatest no is:"+b);
	}
	else{
		System.out.println("Greatest no is:"+c);
	}
}
}
