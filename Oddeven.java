import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        int n = sc.nextInt();
        int[] arr = new int[n];

        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        sc.close();
    }
    }
}