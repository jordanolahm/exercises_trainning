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

        // Remove duplicates
        List<Integer> uniqueNumbers = removeDuplicates(numbers);

        // Show result
        System.out.println("Lista original: " + numbers);
        System.out.println("Lista sem duplicatas: " + uniqueNumbers);
    }

     // Call method to remove duplicate elements in list
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