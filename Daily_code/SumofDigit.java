import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int num=in.nextInt();
            int sum = 0;

            while(num!=0){
                int digit =num % 10;
                sum += digit;
                num = num / 10;

            }
            System.out.println("Sum of digits: " + sum);
            in.close();
        }
    }
}