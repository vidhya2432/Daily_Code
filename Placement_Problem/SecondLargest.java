import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){

            System.out.println("Enter the number of elements:");
            int num = in.nextInt();

            int arr[] = new int[num];
            System.out.println("Enter the array elements:");
            for(int i=0; i<arr.length; i++){
                arr[i] = in.nextInt();
            }

            int largest = arr[0];
            int secondLargest = arr[0];

            for(int i=1; i<arr.length;i++){
                if(arr[i]> largest){
                    secondLargest = largest;
                    largest = arr[i];
                }
                else if(arr[i]>secondLargest && arr[i]!=largest){
                    secondLargest = arr[i];
                }
            }
            System.out.println("Second largest element in the array is: " + secondLargest);
        }
    }
}
