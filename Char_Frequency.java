import java.util.Scanner;

public class Char_Frequency {
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a String:");
            String str = in.nextLine();
            int[] freq = new int[256];
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                freq[ch]++;
            }
            System.out.println("Character Frequency in the string:");
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > 0) {
                    System.out.println((char) i + "-> " + freq[i]);
                }
            }
            in.close();
        }
    }
}
