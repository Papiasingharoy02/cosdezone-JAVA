import java.util.*;

import java.lang.*;

import java.io.*;

class palindrome{
public static void main(String args[])throws java.lang.Exception{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
int r,sum=0;
int x=n;
while(n>0){
	     r=n%10;
	     sum=(sum*10)+r;
	     n=n/10;
	}

if(x==sum){
		System.out.println("It is a palindrome number");
}
else{
System.out.println("It is not a palindrome number");
}
}
}

		