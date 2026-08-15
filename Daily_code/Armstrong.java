import java.util.Scanner;

public class Armstrong{
    public static void main(String [] args){
        try(Scanner in = new Scanner(System.in)){

            System.out.println("Enter a number:");
            int num = in.nextInt();

            int org = num;
            int temp =num;

            while(num!=0){
                temp = temp/10;
            }

            int sum = 0 ;
            temp = sum;

            while(num!=0){
                int digit1 = num%10;
                sum = sum + (int)Math.pow(digit1,digit1);
                temp = temp/10;
            }
            if(sum == org){
                System.out.println("Armstrong number");
            }
            else{
                System.out.println("Not an Armstrong number");
            }
        }
    }
}