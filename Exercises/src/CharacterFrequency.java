import java.util.HashMap;

public class CharacterFrequency {

    public static void main(String[] args) {
        String input = "hello world";

        // Chama o método para contar a frequência de caracteres
        HashMap<Character, Integer> frequencyMap = countCharacterFrequency(input);

        // Exibe o resultado
        System.out.println("Frequência de caracteres:");
        for (HashMap.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Método que conta a frequência de caracteres em uma string
    public static HashMap<Character, Integer> countCharacterFrequency(String str) {
        HashMap<Character, Integer> charFrequency = new HashMap<>();

        for (char c : str.toCharArray()) {
            // Se o caractere já está no mapa, incrementa o contador
            if (charFrequency.containsKey(c)) {
                charFrequency.put(c, charFrequency.get(c) + 1);
            } else {
                // Caso contrário, adiciona o caractere ao mapa com frequência 1
                charFrequency.put(c, 1);
            }
        }
        return charFrequency;
    }
}