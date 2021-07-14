import java.util.*;

import java.lang.*;

import java.io.*;

class Fahrenheitcelsius{
public static void main(String args[])throws java.lang.Exception{
				float c,F;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the temp in celsius :");
				c=sc.nextInt();
				F= c * 9/5 + 32;
				System.out.println("Fahrenheit value is :"+F);
				}
				}