import java.util.HashMap;

public class LongestSubstring {

    public static void main(String[] args) {
        String input = "abcabcbb";

        // Call method to find largest substring without repeat char
        String longestSubstring = findLongestSubstring(input);

        // Show results
        System.out.println("A maior substring sem caracteres repetidos é: " + longestSubstring);
    }

    // Method to find largest substring without repeat char
    public static String findLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        String longestSubstring = "";

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // if char was viewed, update the current position in substring
            if (charIndexMap.containsKey(currentChar)) {
                // update the initial position when necessary
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            // organize and update the position of char in map
            charIndexMap.put(currentChar, i);

            // Calculate the width in current substring
            int currentLength = i - start + 1;

            // update largest substring
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestSubstring = s.substring(start, i + 1);
            }
        }

        return longestSubstring;
    }
}