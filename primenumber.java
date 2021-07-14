import java.util.*;

import java.lang.*;

import java.io.*;

class primenumber{
public static void main(String args[])throws java.lang.Exception{
		int i,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(i=1;i<=n;i++){
				     if(n%i==0){
					          c++;
							}
						}
					if(c==2){
						System.out.println("It is a prime number");
						}
					else{
						System.out.println("It is not a prime number");
					     }
                              		 }
             			  }
                    
				
