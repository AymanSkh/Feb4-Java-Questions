package programs;

import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		int userInput = sc.nextInt();
		int currentNumber = 1;
		int colMin = 0;
		int rowMin = 0;
		int colMax = userInput-1;
		int rowMax = userInput-1;
		
		int spiral[][] = new int[userInput][userInput];
		
		
		while( rowMin<=rowMax && colMin <= colMax ) {
		 
		//left to right
		 for(int j=colMin;j<=colMax;j++) {
			spiral[rowMin][j]= currentNumber;
			currentNumber++;
		 }
		 rowMin++;
		 
		 //top to bot
		 for(int j=rowMin;j<=rowMax;j++) {
			 spiral[j][colMax] = currentNumber;
			 currentNumber++;
		 }
		 colMax--;
		 
		 //right to left
		 for(int j=colMax;j>=colMin;j--) {
			 spiral[rowMax][j] = currentNumber;
			 currentNumber++;
		 }
		 rowMax--;
		 
		 //bot to top
		 for(int j=rowMax;j>=rowMin;j--) {
			 spiral[j][colMin] = currentNumber;
			 currentNumber++;
			
		 }
		 colMin++;
		}

	for(int i=0;i<userInput;i++) {
		for(int j=0;j<userInput;j++) {
			System.out.printf("%4d",spiral[i][j]);
			
		}
		System.out.println();
	}
	
		
		
		}

	}


