import java.util.HashMap;
import java.util.Map;

/*
 * - creates a list to receive the string.
 * - Scans the list to count the words.
 * - Uses a HashMap (key and value)
 * - Define a function that returns the map and receives the input text.
 * Split the received text into words.
 * - Add this to a vector of words
 * - Scans the word vector, where each element is a word
 */


public class WordCounter {

    public static void main(String[] args) {
        String text = "This is a sample text this text is a sample text";

        // Call method counter of words
        Map<String, Integer> wordCountMap = countWordOccurrences(text);

        // Show result
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method that counts word occurrences
    public static Map<String, Integer> countWordOccurrences(String text) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = text.toLowerCase().split("\\s+");

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        return wordCountMap;
    }
}