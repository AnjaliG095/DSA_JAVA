// Program: Demonstrate the use of a do-while loop.
// Output Example:
// 0
// 1
// 2
// ...
// 10
//
//  Loops (do-while)

public class DoWhileLoop {

    public static void main(String[] args) {

        int i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        // A do-while loop executes at least once
        // before checking the condition.
    }
}