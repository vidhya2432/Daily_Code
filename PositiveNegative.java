import java.util.Scanner;

public class PositiveNegative{
    public static void main(String [] args){
        try(Scanner in =new Scanner (System.in)){
            int num = in.nextInt();
            System.out.println("Enter a number:");

            if(num>0){
                System.out.println("Positive");
    
            }else if (num<0){
                System.out.println("Negative");

            }else{
                System.out.println("Zero");
            }
        }
    }
}