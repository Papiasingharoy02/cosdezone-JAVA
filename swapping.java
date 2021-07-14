import java.util.*;

import java.lang.*;

import java.io.*;

class swapping{
static void number(int m,int g){
	
	int temp=m;
	m=g;
	g=temp;
	System.out.println("m is: "+m+"\ng is: "+g);
}
public static void main(String args[])throws java.lang.Exception{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the m:");
	System.out.println("Enter the g:");
	int m=sc.nextInt();
	int g=sc.nextInt();
	number(m,g);
}
}