import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        try(Scanner in = new Scanner(System.in)) {

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        if (n < 0) {

            System.out.println("Factorial is not defined for negative numbers");

        } else {

            long fact = 1;

            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial of " + n + " is: " + fact);
        }

        in.close();
    }
}
}

/*public class Factorial {

    static long factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Factorial = " + factorial(n));
    }
} */
