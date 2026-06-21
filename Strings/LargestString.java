// Program: Find the lexicographically largest String.
//
// Logic:
// 1. Assume first String is largest.
// 2. Compare each String using compareTo().
// 3. Update largest when a bigger String is found.
// 4. Print the largest String.
//
// Time Complexity: O(n)
// Space Complexity: O(1)
package Strings;

public class LargestString {

    public static void main(String[] args) {

        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];

        for(int i = 1; i < fruits.length; i++) {

            if(fruits[i].compareTo(largest) > 0) {
                largest = fruits[i];
            }
        }

        System.out.println("Largest String = " + largest);
    }
}