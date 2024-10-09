import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);

        // Remove duplicatas
        List<Integer> uniqueNumbers = removeDuplicates(numbers);

        // Exibe o resultado
        System.out.println("Lista original: " + numbers);
        System.out.println("Lista sem duplicatas: " + uniqueNumbers);
    }

    // Método que remove duplicatas de uma lista
    public static List<Integer> removeDuplicates(List<Integer> list) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer number : list) {
            if (seen.add(number)) {
                result.add(number);
            }
        }

        return result;
    }
}