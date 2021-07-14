import java.util.*;

import java.lang.*;

import java.io.*;

class userdefineasciivalue{
public static void main(String args[])throws java.lang.Exception{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the character:");
char chr=sc.next().charAt(0);
int asciivalue=chr;
System.out.println("Ascii value of "+chr+" is "+asciivalue);
}
}
