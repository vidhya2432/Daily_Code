import java.util.Scanner;

public class Count_digit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int count = 0;

        while (num > 0) {
            num /= 10; // Remove the last digit
            count++;   // Increment the count
        }

        System.out.println("Number of digits: " + count);
    }
}