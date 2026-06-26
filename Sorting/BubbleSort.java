// Program: Sort an array using Bubble Sort
package Sorting;

// Output Example:
// Sorted Array: 1 2 4 5 8
//
// Concept: Sorting (Bubble Sort)
//
// Time Complexity: O(n²)
// Space Complexity: O(1)

public class BubbleSort {

    public static void bubbleSort(int arr[]) {

        for (int turn = 0; turn < arr.length - 1; turn++) {

            for (int j = 0; j < arr.length - 1 - turn; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {5, 2, 8, 1, 4};

        bubbleSort(arr);

        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}