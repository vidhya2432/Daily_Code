import java.util.Scanner;

public class Count_words {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a String:");
            String str = in.nextLine();

            str = str.trim();
            int count=0;
            if (str.isEmpty()) {

                String[] words = str.split("\\s+");
                count = words.length;
            }

            System.out.println("Number of words in the string: " + count);
            in.close();
        }
    }
}
