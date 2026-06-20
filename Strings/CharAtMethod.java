// Program: Access characters of a String using charAt().
//
// Logic:
// 1. Create a String.
// 2. Use charAt(index) to get a character.
// 3. Print characters at different indices.
//
// Time Complexity: O(1)
// Space Complexity: O(1)
package DSA_Java.Strings;

public class CharAtMethod {
    public static void main(String[] args) {

        String name = "Anjali";

        // Accessing characters using charAt()
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
         // For Printing all character 
        for(int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
    }
}
}