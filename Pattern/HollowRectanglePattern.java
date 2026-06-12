import java.util.Scanner;

// Program: Print a Hollow Rectangle Pattern using stars.
// Input Example:
// Rows = 4
// Columns = 6
//
// Output Example:
// ******
// *    *
// *    *
// ******
//
// Concept: Pattern Printing (Nested Loops and Conditions)

public class HollowRectanglePattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {

                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}