package homeworks;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        // Խնդիր 1
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }int[] numbers1 = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};
        System.out.println();

        // Խնդիր 2
        System.out.println("First element: " + numbers[0]);

        // Խնդիր 3
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Խնդիր 4
        System.out.println("Array length: " + numbers.length);

        // Խնդիր 5
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number: " + min);

        // Խնդիր 6
        if (numbers.length <= 2) {
            System.out.println("Can't print middle values");
        } else if (numbers.length % 2 != 0) {
            int mid = numbers.length / 2;
            System.out.println("Middle element: " + numbers[mid]);
        } else {
            int mid1 = (numbers.length / 2) - 1;
            int mid2 = numbers.length / 2;
            System.out.println("Middle elements: " + numbers[mid1] + " " + numbers[mid2]);
        }

        // Խնդիր 7
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);

        // Խնդիր 8
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Odd numbers count: " + oddCount);

        // Խնդիր 9
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        // Խնդիր 10
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);

    }
}