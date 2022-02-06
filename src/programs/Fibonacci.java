
//In fibonacci series, next number is the sum of previous two numbers 
//for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.


package programs;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numberZero = 0;
	    int numberOne = 1;
		int	newNumber;
		int count = sc.nextInt();
		
		System.out.print(numberZero+" "+numberOne);
		
		for(int i = 2;i <= count;++i) {
			newNumber = numberZero + numberOne;
			System.out.print(" "+newNumber);
			numberZero = numberOne;
			numberOne = newNumber;
			
			
		}
		

	}

}


