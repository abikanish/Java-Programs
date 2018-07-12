package abii;

import java.util.Scanner;

public class desending {
public static void main(String []args){
	int n,i,j,k,temp=0;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the range");
	 n=input.nextInt();
	 System.out.println("enter the number");
	 int [] a=new int[n];
     for(i=0;i<n;i++) {
    	 a[i]=input.nextInt();
    	 }
     for(j=0;j<n;j++) {
     for(k=0;k<n;k++) {
    	if (a[j]>a[k]) {
    	 temp=a[j];
    	 a[j]=a[k];
    	 a[k]=temp;
    	}
     }
    	}
    	for(i=0;i<n;i++) {
    		System.out.println(a[i]);
}

    
}
}
