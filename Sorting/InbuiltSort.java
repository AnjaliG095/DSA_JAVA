package Sorting;
// Program: Sort an array using Java's inbuilt Arrays.sort() method.
// Input Example: {5, 2, 8, 1, 4}
// Output Example: 1 2 4 5 8
//
// Concept: Inbuilt Sorting (Arrays.sort())
//
// Time Complexity:
// O(n log n) for most cases
//
// Space Complexity:
// Depends on implementation
import java.util.Arrays;
public class InbuiltSort {
    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 1, 4};

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
