import java.util.Scanner;

public class SumofArray{
    public static void main(String [] args){

        try(Scanner in = new Scanner(System.in)){

            System.out.println("Enter the Number of elements:");
            int num = in.nextInt();
            int arr[] = new int[num];
            int sum = 0;

            System.out.println("Enter the array elements:");

            for(int i=0; i<arr.length; i++){
                arr[i] = in.nextInt();
                sum+=arr[i];
            }
            System.out.println("Sum of the array elements is: " + sum);
            in.close();
        }
    }
}