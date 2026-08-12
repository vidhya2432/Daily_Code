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
