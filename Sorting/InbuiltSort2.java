// Program: Sort an array in descending order using Arrays.sort() and Collections.reverseOrder().
// Input Example: {5, 2, 8, 1, 4}
// Output Example: [8, 5, 4, 2, 1]
//
// Concept: Inbuilt Sorting (Descending Order)
package Sorting;
import java.util.Arrays;
import java.util.Collections;


public class InbuiltSort2 {

    public static void main(String[] args) {

        Integer arr[] = {5, 2, 8, 1, 4};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }

    
}
