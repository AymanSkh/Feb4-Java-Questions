
// Java Program to copy all elements of one array into another array

package programs;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		
		int [] array1 = new int [] {1,2,3,4,5,6,7,8,9};
		
		int [] array2 = new int[array1.length];
		
		for(int i=0;i<array1.length;i++) {
			array2[i]=array1[i];
			
		}
		System.out.println("Main Array Elements");
		for(int i=0;i<array1.length;i++) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		
		System.out.println("Copy Array Elements");
		for(int i=0;i<array2.length;i++) {
			System.out.print(array2[i]+" ");
			
		}
	}

}
