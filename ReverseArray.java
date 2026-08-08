import java.util.Scanner;

public class ReverseArray {
  public static void main(String[] args){
    try(Scanner in = new Scanner(System.in)){

        System.out.println("Enter the number of elements:");
        int num = in.nextInt();

        int arr[] = new int[num];
        System.out.println("Enter the array elements:");

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        int start = 0;
        int end = arr.length-1;

        while(start<end){
        
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
        }

        System.out.println("Reversed array is:");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
  }  
}
