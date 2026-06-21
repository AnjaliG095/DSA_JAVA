// Program: Check whether a String is a palindrome.
//
// Logic:
// 1. Compare characters from both ends.
// 2. If any pair is different, return false.
// 3. If all pairs match, return true.
//
// Time Complexity: O(n)
// Space Complexity: O(1)
package Strings;

public class PalindromeString {

    public static boolean isPalindrome(String str) {

        for(int i = 0; i < str.length()/2; i++) {

            int n = str.length();

            if(str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "madam";

        System.out.println(isPalindrome(str));
    }
}