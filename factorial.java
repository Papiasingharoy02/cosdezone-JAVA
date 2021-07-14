import java.util.*;

import java.lang.*;

import java.io.*;

class factorial{
public static void main(String args[])throws java.lang.Exception{
			
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number:");
				int n=sc.nextInt();
				int i,fact=1;
				for(i=1;i<=n;i++){
							fact=fact*i;
						  }
				System.out.println("Factorial of "+n+" is:"+fact);
				}
				}