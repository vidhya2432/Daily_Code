import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements:");

        for (int i = 0; i < n; i++) {

            boolean duplicate = false;

            // Check if this element appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            // Check if the element occurs again
            if (!duplicate) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.print(arr[i] + " ");
                        break;
                    }
                }
            }
        }

        sc.close();
    }
    }
}