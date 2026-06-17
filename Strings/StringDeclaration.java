
// Program: String Declaration and Initialization.
//
// Logic:
// 1. Declare a String variable.
// 2. Initialize it with a value.
// 3. Print the String.
// 4. Demonstrate another way of creating a String using 'new' keyword.
//
// Time Complexity: O(1)
// Space Complexity: O(1)
package Strings;

public class StringDeclaration {
    public static void main(String[] args) {

        // String Declaration
        String name = "Anjali";

        // Printing String
        System.out.println("Name: " + name);

        // Another way of creating a String
        String city = new String("Jaipur");

        System.out.println("City: " + city);
    }
}
