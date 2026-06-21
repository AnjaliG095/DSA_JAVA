// Program: Search a key in a sorted 2D matrix.
//
// Logic:
// 1. Start from the top-right corner.
// 2. Move left if key is smaller.
// 3. Move down if key is larger.
// 4. Stop when key is found or search space ends.
//
// Time Complexity: O(n + m)
// Space Complexity: O(1)
public class StaircaseSearch {
    public static boolean StaircaseSearch(int matrix[][], int key){
        int row=0 ,col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){ 
        if (matrix[row][col]==key){
           System.out.println("Found at (" + row + "," + col + ")");
            return true;
        }
        else if (key<matrix[row][col]){
            col--;
        }
        else{
            row++;
        }
        }
       return false;
    }
     public static void main(String[] args) {

        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 33;

        StaircaseSearch(matrix, key);
    }
      
    }
    

