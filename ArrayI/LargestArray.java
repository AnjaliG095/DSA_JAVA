
public class LargestArray {

    public static int findLargest(int numbers[]) {
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {3, 4, 6, 9, 8};
        System.out.println("Largest Element = "
                + findLargest(numbers));
    }
}