// Program: Convert the first letter of each word to uppercase.
//
// Logic:
// 1. Convert the first character to uppercase.
// 2. Traverse the String.
// 3. Whenever a space is found, capitalize the next character.
// 4. Store the result using StringBuilder.
// 5. Return the updated String.
//
// Time Complexity: O(n)
// Space Complexity: O(n)
package Strings;

public class ConvertToUpperCase {

    public static String toUpperCase(String str) {

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++) {

            if(str.charAt(i) == ' ' && i < str.length()-1) {

                sb.append(str.charAt(i));
                i++;

                sb.append(Character.toUpperCase(str.charAt(i)));

            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "hi i am anjali";

        System.out.println(toUpperCase(str));
    }
}