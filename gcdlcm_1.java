import java.util.Scanner;

public class gcdlcm_1 {
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter first number: ");
            int a = in.nextInt();
            System.out.print("Enter second number: ");
            int b = in.nextInt();

           int x=a;
           int y=b;

           while(y!=0){
            int rem = x%y;
            x=y;
            y=rem;
           }
           int gcd = x;

            int lcm = (a*b)/gcd;

            System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
            System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        }
    }
}
