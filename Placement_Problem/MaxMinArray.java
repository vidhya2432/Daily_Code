import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){

            System.out.println("Enter the number of elements:");
            int num = in.nextInt();

            int arr[] = new int[num];

            System.out.println("Enter the array elements:");
            for(int i=0; i<arr.length; i++){
                arr[i] = in.nextInt();
            }

            int max = arr[0];
            int min = arr[0];

            for(int i=1; i<arr.length; i++){
                if (arr[i] > max){
                    max = arr[i];
                }
                if (arr[i] < min){
                    min = arr[i];
                }
            }

            System.out.println("Maximum element in the array is: " + max);
            System.out.println("Minimum element in the array is: " + min);

            in.close();
        }
    }
}
