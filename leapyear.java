import java.util.*;
import java.lang.*;
import java.io.*;

class leapyear{
public static void main(string args[])throws java.lang.Exception{

		Scanner sc=new Scanner(System.in);
		System.out.println("Mention the year:");
		int y= sc.nextInt();
		if(y%400==0){
				System.out.printlm("\n"+y+"is a leap year");
}
		else if(y%100==0){
				    System.out.println("\n"+y+"is not a leap year");
}
		else if(y%4==0){
				  System.out.println("\n"+y+"is a leap year");
}
		else{
			System.out.println("It is not a leap year");
}
}
}

		 