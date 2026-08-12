import java.util.Scanner;

public class MergeArray {
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){

            System.out.println("Enter the number of elements for first array:");
            int num1 = in.nextInt();

            int arr1[] = new int[num1];
            System.out.println("Enter the first array elements:");

            for(int i=0; i<arr1.length; i++){
                arr1[i] = in.nextInt();
            }

            System.out.println("Enter the number of elements for second array:");
            int num2 = in.nextInt();

            int arr2[] = new int[num2];
            System.out.println("Enter the second array elements:");

            for(int i=0; i<arr2.length; i++){
                arr2[i] = in.nextInt();
            }

            int merge[] = new int[num1 + num2];

            for(int i=0; i<arr1.length; i++){
                merge[i] = arr1[i];
            }

            for(int i=0; i<arr2.length; i++){
                merge[arr1.length + i] = arr2[i];
            }

            System.out.println("Merged array is:");
            for(int i=0; i<merge.length; i++){
                System.out.print(merge[i] + " ");
            }
        }
    }   
}
