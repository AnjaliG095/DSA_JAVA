// Program: Sort an array using Selection Sort.
// Input Example: {7, 3, 5, 1, 8}
// Output Example: 1 3 5 7 8
//
// Concept: Sorting (Selection Sort)
//
// Time Complexity: O(n²)
// Space Complexity: O(1)
package Sorting;
public class SelectionSort {

    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            // Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {7, 3, 5, 1, 8};

        selectionSort(arr);
        printArray(arr);
    }
}