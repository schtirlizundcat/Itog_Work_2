import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            String longestWord = "";

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            System.out.println("Самое длинное слово: " + longestWord);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
    }
}