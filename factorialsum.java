import java.util.*;

import java.lang.*;

import java.io.*;

class factorialsum{
public static void main(String args[])throws java.lang.Exception{

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the range:");
			int n=sc.nextInt();
			int i,j,fact=1;
			int sum=0;
			for(i=1;i<=n;i++){
					       fact=1;
		            	               for(j=1;j<=i;j++)
  						fact*=j;
						sum+=fact;
					  }
			System.out.println("The factorial sum of "+n+" is: "+sum);
			}
		}