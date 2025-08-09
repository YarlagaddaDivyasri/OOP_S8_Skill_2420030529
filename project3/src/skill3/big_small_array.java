package skill3;

public class big_small_array {
    public static void main(String[] args) {
        int[] numbers = {25, 12, 56, 32, 9, 78, 3};

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
