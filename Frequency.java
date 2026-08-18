import java.util.Scanner;

public class Frequency {
    public static void main(String [] args){
        try(Scanner in= new Scanner(System.in)){
            System.out.print("Enter a Number: ");
            int n = in.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the elements of the array: ");

        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }

        boolean[] visited = new boolean[n];
        System.out.println("Frequency of elements in the array: ");

        for(int i=0; i<n; i++){
            if(visited[i]){
                continue;
            }
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
            in.close();

        }
        }
    }
}
