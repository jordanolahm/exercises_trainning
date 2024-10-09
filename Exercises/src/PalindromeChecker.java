public class PalindromeChecker {

    public static void main(String[] args) {
        String testString1 = "A man, a plan, a canal, Panama!";
        String testString2 = "Was it a car or a cat I saw?";
        String testString3 = "No 'x' in Nixon";
        String testString4 = "Not a palindrome";

        // Teste das strings
        System.out.println("\"" + testString1 + "\" is palindrome: " + isPalindrome(testString1));
        System.out.println("\"" + testString2 + "\" is palindrome: " + isPalindrome(testString2));
        System.out.println("\"" + testString3 + "\" is palindrome: " + isPalindrome(testString3));
        System.out.println("\"" + testString4 + "\" is palindrome: " + isPalindrome(testString4));
    }

    // Método que verifica se a string é um palíndromo
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1; // Ponteiro para o final da string

        while (left < right) {
            // Ignora caracteres não alfanuméricos à esquerda
            while (left < right && !isAlphanumeric(str.charAt(left))) {
                left++;
            }
            // Ignora caracteres não alfanuméricos à direita
            while (left < right && !isAlphanumeric(str.charAt(right))) {
                right--;
            }
            // Compara os caracteres
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false; // Não é um palíndromo
            }
            left++;
            right--;
        }
        return true; // É um palíndromo
    }

    // Método auxiliar para verificar se um caractere é alfanumérico
    private static boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static boolean isPalindromeAuxiliary(String str) {
        // Remove espaços e caracteres especiais e converte para minúsculas
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Inverte a string limpa
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();

        // Compara a string limpa com a versão invertida
        return cleanedStr.equals(reversedStr);
    }
}