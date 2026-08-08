import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args){

        try(Scanner in = new Scanner(System.in)){

            System.out.println("Enter the number of elements:");
            int num = in.nextInt();

            int arr[] = new int[num];
            System.out.println("Enter the array elements:");

            for(int i=0; i<arr.length; i++){
                arr[i] = in.nextInt();
            }

            for(int i=0; i<arr.length; i++){
                if(arr[i] %2==0){
                    System.out.println("Even Number: " + arr[i]);
                }else{
                    System.out.println("Odd Number: " + arr[i]);
                }
            }
            in.close();
        }
    }
}
