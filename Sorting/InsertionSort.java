// Program: Sort an array using Insertion Sort.
// Input Example: {5, 3, 4, 1, 8}
// Output Example: 1 3 4 5 8
//
// Concept: Sorting (Insertion Sort)
//
// Time Complexity:
// Best Case  : O(n)
// Average Case: O(n²)
// Worst Case : O(n²)
//
// Space Complexity: O(1)

package Sorting;

public class InsertionSort {

    public static void insertionSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int prev = i - 1;

            // Shift elements greater than current
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insert current element at correct position
            arr[prev + 1] = current;
        }
    }

    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {5, 3, 4, 1, 8};

        insertionSort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}