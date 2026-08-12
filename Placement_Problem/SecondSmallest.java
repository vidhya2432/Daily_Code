import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){

            System.out.println("Enter the number of elements:");
            int num = in.nextInt();

            int arr[] = new int[num];
            System.out.println("Enter the array elements:");
            for(int i=0; i<arr.length; i++){
                arr[i] = in.nextInt();
            }

            int smallest = arr[0];
            int secondSmallest = arr[0];

            for(int i=1; i<arr.length;i++){
                if(arr[i]< smallest){
                    secondSmallest = smallest;
                    smallest = arr[i];
                }
                else if(arr[i]<secondSmallest && arr[i]!=smallest){
                    secondSmallest = arr[i];
                }
            }
            System.out.println("Second smallest element in the array is: " + secondSmallest);
        }
    }
}
