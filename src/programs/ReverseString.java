
// reverse a string in Java without using reverse function


package programs;

import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) { 
	
	String s;  
	Scanner sc=new Scanner(System.in);  
	
	
	System.out.print("String: ");  
	
	s=sc.nextLine();   
	
	System.out.print("Reverse string : "); 
	
	for(int i=s.length();i>0;--i)               
	{  
	System.out.print(s.charAt(i-1)); 
	}  
	}  
	}  



