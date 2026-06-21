// Program: Demonstrate the use of StringBuilder.
//
// Logic:
// 1. Create a StringBuilder object.
// 2. Add characters using append().
// 3. Build the final String.
// 4. Print the result.
//
// Time Complexity: O(n)
// Space Complexity: O(n)
package Strings;

public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("");

        // Adding characters
        sb.append("A");
        sb.append("n");
        sb.append("j");
        sb.append("a");
        sb.append("l");
        sb.append("i");

        System.out.println(sb);
    }
}