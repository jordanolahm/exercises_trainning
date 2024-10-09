import java.util.HashMap;

public class CharacterFrequency {

    public static void main(String[] args) {
        String input = "hello world";

        // Call method to count often caracteres in map
        HashMap<Character, Integer> frequencyMap = countCharacterFrequency(input);

        // show results
        System.out.println("Frequência de caracteres:");
        for (HashMap.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to count often of element in string
    public static HashMap<Character, Integer> countCharacterFrequency(String str) {
        HashMap<Character, Integer> charFrequency = new HashMap<>();

        for (char c : str.toCharArray()) {
            //verify if map contains the char, increments the counter
            if (charFrequency.containsKey(c)) {
                charFrequency.put(c, charFrequency.get(c) + 1);
            } else {
                // in other hand, adding char in map with once frequency
                charFrequency.put(c, 1);
            }
        }
        return charFrequency;
    }
}