// Program: Sort an array using Counting Sort.
// Input Example: {1, 4, 1, 3, 2, 4, 3, 7}
// Output Example: 1 1 2 3 3 4 4 7
//
// Concept: Counting Sort
//
// Time Complexity: O(n + k)
// Space Complexity: O(k)
//
// Note:
// Works efficiently when array elements are small positive integers.

public class CountingSort {

    public static void countingSort(int arr[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
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

        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        countingSort(arr);

        printArray(arr);
    }
}