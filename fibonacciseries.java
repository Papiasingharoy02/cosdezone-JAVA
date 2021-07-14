import java.util.*;

import java.lang.*;

import java.io.*;

class fibonacciseries{
public static void main(String args[])throws java.lang.Exception{

			int a=1,b=1,c,i;

			Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter the n:");
		
			System.out.print(a+" " +b);
		
			int n=sc.nextInt();
		
			for(i=3;i<=n;i++){
		
			c=a+b;
		
			System.out.print(" "+c);
		
			a=b;
	
			b=c;
}
}
}

