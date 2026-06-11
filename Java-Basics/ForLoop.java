// Program: Calculate the sum of the first N natural numbers.
// Input Example: n = 8
// Output Example: 36
//
// Concept: Loops (for loop)

public class ForLoop{ 

    public static void main(String[] args) {

        int n = 8;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}