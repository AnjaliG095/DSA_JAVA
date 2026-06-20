// Program: Create, input, and display a 2D array (Matrix).
//
// Logic:
// 1. Take matrix elements as input.
// 2. Store them in a 2D array.
// 3. Traverse rows and columns using nested loops.
// 4. Print the matrix.
//
// Time Complexity: O(n × m)
// Space Complexity: O(1)
import java.util.*;


public class Matrices {
    public static void main(String[]args){
        int matrix[][]=new int[3][3];
        int n =matrix.length,m=matrix[0].length;

        Scanner sc =new Scanner(System.in);
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m; j++){
         matrix[i][j]=sc.nextInt();
        
        }
    }
    for(int i = 0;i<n;i++){
            for(int j = 0;j<m; j++){
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
    
        
    }
    
}
}