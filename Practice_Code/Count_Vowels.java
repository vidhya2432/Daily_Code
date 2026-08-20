import java.util.Scanner;

public class Count_Vowels{
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter a String:");
            String str = in.nextLine();
            int count=0;

            for(int i=0;i<str.length();i++){
                char ch = Character.toLowerCase(str.charAt(i));

                if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                    count++;
                }
            }
            System.out.println("Number of vowels in the string: " + count);
            in.close();
        }
    }
}