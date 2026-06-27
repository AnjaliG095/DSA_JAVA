// Program: Compare Strings using equals(), equalsIgnoreCase(),
// and compareTo().
//
// Logic:
// 1. equals() checks exact equality.
// 2. equalsIgnoreCase() ignores letter case.
// 3. compareTo() compares strings lexicographically.
//
// Time Complexity: O(n)
// Space Complexity: O(1)
package Strings;

public class StringComparison {
    public static void main(String[] args) {

        String str1 = "Anjali";
        String str2 = "Anjali";
        String str3 = "anjali";

        // equals()
        System.out.println(str1.equals(str2));

        // equalsIgnoreCase()
        System.out.println(str1.equalsIgnoreCase(str3));

        // compareTo()
        System.out.println("apple".compareTo("mango"));
        System.out.println("mango".compareTo("apple"));
        System.out.println("apple".compareTo("apple"));
    }
}
