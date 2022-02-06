
//Reverse a Number in Java

package programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int reverse = 0;
		
		for(;number!=0;number=number/10) {
			int remainder = number%10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("Reverse of number "+ reverse);
	}

}
