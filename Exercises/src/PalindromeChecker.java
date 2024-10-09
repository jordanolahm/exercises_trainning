public class PalindromeChecker {

    public static void main(String[] args) {
        String testString1 = "A man, a plan, a canal, Panama!";
        String testString2 = "Was it a car or a cat I saw?";
        String testString3 = "No 'x' in Nixon";
        String testString4 = "Not a palindrome";

        // Suits Tests
        System.out.println("\"" + testString1 + "\" is palindrome: " + isPalindrome(testString1));
        System.out.println("\"" + testString2 + "\" is palindrome: " + isPalindrome(testString2));
        System.out.println("\"" + testString3 + "\" is palindrome: " + isPalindrome(testString3));
        System.out.println("\"" + testString4 + "\" is palindrome: " + isPalindrome(testString4));
    }

    // Method to verify if string is palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1; // Pointer to final string

        while (left < right) {
            // Ignores non-alphanumeric characters on the left
            while (left < right && !isAlphanumeric(str.charAt(left))) {
                left++;
            }
            // Ignores non-alphanumeric characters on the right
            while (left < right && !isAlphanumeric(str.charAt(right))) {
                right--;
            }
            // compare characters
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Auxiliar method to verify alphanumeric characters
    private static boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    // utilitary method
    public static boolean isPalindromeAuxiliary(String str) {
        // Remove spaces and special characters and convert to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Inverse string
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        // Compare both strings
        return cleanedStr.equals(reversedStr);
    }
}