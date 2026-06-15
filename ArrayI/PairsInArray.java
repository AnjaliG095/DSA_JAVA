public class PairsInArray {

    public static void printPairs(int numbers[]) {
        int totalPairs = 0;

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("("
                        + current + ","
                        + numbers[j] + ") ");

                totalPairs++;
            }

            System.out.println();
        }

        System.out.println("Total Pairs = " + totalPairs);
    }

    public static void main(String[] args) {
        int numbers[] = {3, 4, 6, 9, 8};
        printPairs(numbers);
    }
}