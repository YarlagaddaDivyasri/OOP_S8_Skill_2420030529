package skill3;
public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {35, 10, 55, 20, 5};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
               
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Array (Ascending Order):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

