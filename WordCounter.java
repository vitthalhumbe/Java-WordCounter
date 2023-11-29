import java.util.Scanner;

public class WordCounter {
    private static String str;
    private static int word_count = 1;
    private static int char_count = 0;


    public static void main(String[] args) {
        Scanner typo = new Scanner(System.in);
        System.out.print("Type Here..........\n\n>");
        str = typo.nextLine();

        for (int c = 0; c < str.length(); c++) {
            char curr_char = str.charAt(c);
            char_count += 1;

            if (curr_char == ' ') {
                word_count += 1;
            }
        }

        System.out.println("\n\n>>> Words : " + word_count + "\n>>> Characters : " + char_count);
    }
}
