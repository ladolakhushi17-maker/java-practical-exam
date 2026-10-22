
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the notice sentence and keyword
        String sentence = sc.nextLine();
        String keyword = sc.nextLine();

        // Remove leading and trailing spaces
        sentence = sentence.trim();

        // Split into words using one or more spaces
        String[] words = sentence.split("\\s+");

        // Build the cleaned sentence in lowercase
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(words[i].toLowerCase());
        }

        // Capitalize only the first letter
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        // Find shortest word and count keyword matches
        String shortest = words[0].toLowerCase();
        int keywordCount = 0;

        for (String word : words) {
            String lowerWord = word.toLowerCase();

            if (lowerWord.length() < shortest.length()) {
                shortest = lowerWord;
            }

            if (lowerWord.equals(keyword.toLowerCase())) {
                keywordCount++;
            }
        }

        // Count vowels in the original sentence
        int vowels = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = Character.toLowerCase(sentence.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowels++;
            }
        }

        // Print exactly five lines
        System.out.println("Sentence: " + sb);
        System.out.println("Words: " + words.length);
        System.out.println("Shortest word: " + shortest);
        System.out.println("Keyword count: " + keywordCount);
        System.out.println("Vowels: " + vowels);

        sc.close();
    }
}
