import java.util.Scanner;

public class FibonacciSum {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

        System.out.print("Enter number of terms: ");
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            sum = sum + a;

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("\n Sum = " + sum);

        in.close();
    }
}
}

/* static int fibonacci(int n) {

    if (n <= 1) {
        return n;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
}*/