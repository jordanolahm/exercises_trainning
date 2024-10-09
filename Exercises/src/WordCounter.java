import java.util.HashMap;
import java.util.Map;

/*
*  - cria uma lista para receber a string.
*  - Varre a lista, para contabilizar as palavras.
*  - Usa um HashMap (chave e valor)
*  -  Define uma funcao que retona o map e recebe o texto de entrada.
*  -  Split das palavras do texto recebidos em palavras.
*  -  Adiciona isso num vetor de palavras
*  - varre o velor de palavras, onde cada elemento é uma palavra
* */


public class WordCounter {

    public static void main(String[] args) {
        String text = "This is a sample text this text is a sample text";

        // Chama o método para contar as palavras
        Map<String, Integer> wordCountMap = countWordOccurrences(text);

        // Exibe o resultado
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Método que conta as ocorrências de palavras
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