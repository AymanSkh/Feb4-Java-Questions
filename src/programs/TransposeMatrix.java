
//Java Program to find the transpose of a given matrix

package programs;

public class TransposeMatrix {

	public static void main(String[] args) {    
		        int rows, col;    
		            
		        //Initialize matrix a    
		          int firstMatrix[][] = {    
		                          {9, 8, 7},    
		                          {6, 5, 4},    
		                          {3, 2, 1}    
		                       };    
		               
		          rows = firstMatrix.length;    
		        col = firstMatrix[0].length;    
		             
		        int transMatrix[][] = new int[col][rows];    
		            

		        for(int i = 0; i < col; i++){    
		            for(int j = 0; j < rows; j++){    

		                transMatrix[i][j] = firstMatrix[j][i];    
		            }    
		        }    
		        
		        System.out.println("Transpose of given matrix: ");    
		        for(int i = 0; i < col; i++){    
		            for(int j = 0; j < rows; j++){    
		               System.out.print(transMatrix[i][j] + " ");    
		            }    
		            System.out.println();    
		        }    
		    }    
		 
		

	}


