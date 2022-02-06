package programs;

import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int userInput = sc.nextInt();
		int count = 1;
		int topMin = 0;
		int leftMin = 0;
		int topMax = userInput-1;
		int leftMax = userInput-1;
		
		int matrix[][] = new int[userInput][userInput];
		
		
		while( leftMin<=leftMax && topMin <= topMax ) {
		 
		//left to right
		 for(int j=topMin;j<=topMax;j++) {
			matrix[leftMin][j]= count;
			count++;
		 }
		 leftMin++;
		 
		 //top to bot
		 for(int j=leftMin;j<=leftMax;j++) {
			 matrix[j][topMax] = count;
			 count++;
		 }
		 topMax--;
		 
		 //right to left
		 for(int j=topMax;j>=topMin;j--) {
			 matrix[leftMax][j] = count;
			 count++;
		 }
		 leftMax--;
		 
		 //bot to top
		 for(int j=leftMax;j>=leftMin;j--) {
			 matrix[j][topMin] = count;
			 count++;
			
		 }
		 topMin++;
		}

	for(int i=0;i<userInput;i++) {
		for(int j=0;j<userInput;j++) {
			System.out.printf("%4d",matrix[i][j]);
			
		}
		System.out.println("");
	}
	
		
		
		}

	}


