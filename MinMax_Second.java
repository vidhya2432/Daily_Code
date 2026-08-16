import java.util.Scanner;

public class MinMax_Second{
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){

            System.out.println("Enter the number of elements:");
            int num = in.nextInt();

            int arr[] = new int[num];
            System.out.println("Enter the array elements:");
            for(int i=0; i<arr.length; i++){
                arr[i] = in.nextInt();
            }
        int largest = Integer.MIN_VALUE;
        int sec_largest= Integer.MIN_VALUE; //Main function to find second largest and smallest element in the array

        for(int i=1; i<arr.length; i++){
            if(arr[i]> largest){
                sec_largest = largest;
                largest = arr[i];
            }
            else if(arr[i]>sec_largest && arr[i]!=largest){
                sec_largest = arr[i];
            }
        }
        System.out.println("Second largest element in the array is: " + sec_largest);

        
        int smallest = Integer.MAX_VALUE;
        int sec_smallest = Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++){
            if(arr[i]<smallest){
                sec_smallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]<sec_smallest && arr[i]!=smallest){
                sec_smallest = arr[i];
            }
        }
        System.out.println("Second smallest element in the array is: " + sec_smallest);
    }
    
    
}
}