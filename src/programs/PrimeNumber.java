
//Prime Number Program in Java

package programs;

import java.util.Scanner;

public class PrimeNumber {
	static void primeCheck(int number) {
		int mean = 0; 
		mean = number/2;
		int count = 0;
		
		if(number==0||number==1) {
			System.out.println(number+" is not a Prime Number");
			
		}
		else {
			for(int i=2;i<=mean;i++) {
				if(number%i==0) {
					System.out.println(number+" is not a Prime Number");
					count = 1;
					break;
				}
			}
					if(count==0) {
						System.out.println(number+" is a Prime number");
					}
				}
			}
			
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		primeCheck(input);
		

		

	}


}