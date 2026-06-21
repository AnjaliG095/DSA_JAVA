// Program: Search an element in a 2D Array.
//
// Logic:
// 1. Traverse each row using outer loop.
// 2. Traverse each column using inner loop.
// 3. Compare every element with the key.
// 4. If key is found, print its position and return true.
// 5. If the whole matrix is checked and key is not found,
//    return false.
//
// Time Complexity: O(rows × columns)
// Space Complexity: O(1)
public class Search2DArray {

    public static boolean search(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == key) {
                    System.out.println("Key found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }

        System.out.println("Key not found");
        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int key = 5;

        search(matrix, key);
    }
}