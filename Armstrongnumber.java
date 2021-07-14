import java.util.*;

import java.lang.*;

import java.io.*;

class Armstrongnumber{
public static void main(String args[])throws java.lang.Exception{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();
int temp,c=0,p,sum=0;
temp=n;
while(temp>0){
		temp=temp/10;
		c++;
}
temp=n;
while(temp>0){
		p=temp%10;
		temp=temp/10;
		sum+=Math.pow(p,c);
}
if(sum==n){
System.out.println("It is an Armstrong number");
}
else{
System.out.println("It is not an Armstrong number");
}
}
}
