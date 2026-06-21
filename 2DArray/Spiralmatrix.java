// Program: Print matrix elements in spiral order.
//
// Logic:
// 1. Print top, right, bottom, and left boundaries.
// 2. Shrink boundaries after each round.
// 3. Continue until all elements are printed.
//
// Time Complexity: O(n × m)
// Space Complexity: O(1)
public class Spiralmatrix {
    
    public static void spiralmatrix(int matrix[][]){
      int startrow=0;
     int endrow = matrix.length - 1;
      int startcol=0;
      int endcol=matrix[0].length -1;
      while(startrow<=endrow && startcol<=endcol){ 
        //top fixed row = startrow 1 column is varible 
       for(int j=startcol; j<=endcol; j++){ 
           System.out.print(matrix[startrow][j] + " ");
        }
        //right side boundry column fixed= endrow=4 row is vairable
       for(int i=startrow+1; i<=endrow; i++){
    System.out.print(matrix[i][endcol] + " ");
}
        //bottom boundary row fixed endrow =4 col varible 
       for(int j=endcol-1; j>=startcol; j--){ 
         System.out.print(matrix[endrow][j] + " ");
        }
        //left boundry col fixed startcol row is variable
       for(int i=endrow-1; i>=startrow+1; i--){ 
            System.out.print(matrix[i][startcol] + " ");
        }
       startrow++;
startcol++;
endrow--;
endcol--;

      }
    }
    public static void printMatrix(int matrix[][]) {
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}

public static void main(String[] args) {

    int matrix[][] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    System.out.println("Original Matrix:");
    printMatrix(matrix);

    System.out.println("Spiral Order:");
    spiralmatrix(matrix);
}
}
