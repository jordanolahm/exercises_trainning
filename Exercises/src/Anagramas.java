import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;


public class Anagramas {
    // Método principal
    public static void main(String[] args) {
        List<String> words = Arrays.asList("listen", "silent", "enlist", "rat", "tar", "art", "evil", "vile", "live");

        // Chama o método para agrupar anagramas
        Map<String, List<String>> groupedAnagrams = groupAnagrams(words);

        // Exibe o resultado
        for (Map.Entry<String, List<String>> entry : groupedAnagrams.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    // Método que agrupa anagramas
    public static Map<String, List<String>> groupAnagrams(List<String> words) {
        // Cria um HashMap para armazenar os anagramas agrupados
        Map<String, List<String>> anagramMap = new HashMap<>();

        // Itera sobre cada palavra na lista
        for (String word : words) {
            // Converte a palavra para um array de caracteres e ordena o array
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);

            // Converte o array de caracteres ordenado de volta para uma string
            String sortedWord = new String(charArray);

            // Se a chave (versão ordenada) já existir no mapa, adiciona a palavra à lista
            if (!anagramMap.containsKey(sortedWord)) {
                anagramMap.put(sortedWord, new ArrayList<>());
            }
            anagramMap.get(sortedWord).add(word);
        }

        return anagramMap;
    }
}