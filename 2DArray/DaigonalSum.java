// Program: Find the sum of primary and secondary diagonals.
//
// Logic:
// 1. Add primary diagonal elements (i == j).
// 2. Add secondary diagonal elements.
// 3. Avoid counting the middle element twice.
//
// Time Complexity: O(n)
// Space Complexity: O(1)
public class DaigonalSum {
   public static int diagonalSum(int matrix[][]) {
        int sum =0;
        for(int i= 0;i<matrix.length;i++){
            
            //primary daigonal from left to right 
sum +=matrix[i][i];
//secondary daigonal form right to left
           if(i!=matrix.length-1-i){ 
            sum+=matrix[i][matrix.length-i-1];
           }

            }
            return sum;
        }
          public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Diagonal Sum = " + diagonalSum(matrix));
    }

    
        }
        
      

    

