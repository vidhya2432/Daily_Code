import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
    try(Scanner in = new Scanner(System.in)){
            int num=in.nextInt();
            int rev = 0;

            while(num!=0){
                int digit =num % 10;
                rev = rev * 10 + digit;
                num = num / 10;

            }
            System.out.println("Reversed number: " + rev);
            in.close();
        }
    }
}