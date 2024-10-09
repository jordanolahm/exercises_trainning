import java.util.HashMap;

public class LongestSubstring {

    public static void main(String[] args) {
        String input = "abcabcbb";

        // Chama o método para encontrar a maior substring sem caracteres repetidos
        String longestSubstring = findLongestSubstring(input);

        // Exibe o resultado
        System.out.println("A maior substring sem caracteres repetidos é: " + longestSubstring);
    }

    // Método que encontra a maior substring sem caracteres repetidos
    public static String findLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0; // Tamanho da maior substring encontrada
        int start = 0; // Posição inicial da substring
        String longestSubstring = ""; // Armazena a maior substring

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Se o caractere já foi visto, atualiza a posição inicial da substring
            if (charIndexMap.containsKey(currentChar)) {
                // Atualiza a posição inicial se necessário
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }

            // Armazena ou atualiza a posição do caractere no mapa
            charIndexMap.put(currentChar, i);

            // Calcula o tamanho da substring atual
            int currentLength = i - start + 1;
            // Atualiza a maior substring se necessário
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestSubstring = s.substring(start, i + 1);
            }
        }

        return longestSubstring;
    }
}