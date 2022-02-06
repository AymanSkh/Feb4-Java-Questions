package programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
  
			  int remainder,sum=0,temp; 
			  Scanner sc=new Scanner(System.in); 
			  int number=sc.nextInt();
			  
			  temp=number;    
			  while(number>0){    
			   remainder=number%10; 
			   sum=(sum*10)+remainder;    
			   number=number/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
			

	}

