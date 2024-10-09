import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;


public class Anagramas {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art", "evil", "vile", "live");

        // Organize anagrams
        Map<String, List<String>> groupedAnagrams = groupAnagrams(words);

        // Show results
        for (Map.Entry<String, List<String>> entry : groupedAnagrams.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    // Method to group Anagrams
    public static Map<String, List<String>> groupAnagrams(List<String> words) {
        // Create a HashMap to store the grouped anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Iteration each word in list words
        for (String word : words) {
            // convert word to array of char and sorts the array
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);

            //Convert the array of char in string
            String sortedWord = new String(charArray);

            // verify this key already exist in map,  adding the word in list of words
            if (!anagramMap.containsKey(sortedWord)) {
                anagramMap.put(sortedWord, new ArrayList<>());
            }
            anagramMap.get(sortedWord).add(word);
        }

        return anagramMap;
    }
}