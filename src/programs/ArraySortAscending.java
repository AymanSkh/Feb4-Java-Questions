
//Java Program to sort the elements of an array in ascending order

package programs;

public class ArraySortAscending {

	public static void main(String[] args) {       
		        int [] array = new int [] {5, 2, 8, 7, 1};     
		        int temp = 0;     
		        System.out.println("Array Elements: ");    
		        for (int i = 0; i < array.length; i++) {     
		            System.out.print(array[i] + " ");    
		        }    
		                
		        for (int i = 0; i < array.length; i++) {     
		            for (int j = i+1; j < array.length; j++) {     
		               if(array[i] > array[j]) {    
		                   temp = array[i];    
		                   array[i] = array[j];    
		                   array[j] = temp;    
		               }     
		            }     
		        }    
		          
		        System.out.println();    
		            
		        //Displaying elements of array after sorting    
		        System.out.println("Sorted Array: ");    
		        for (int i = 0; i < array.length; i++) {     
		            System.out.print(array[i] + " ");    
		        }    
		    }    
		

	}


