import java.util.*;
import java.util.stream.Collectors;

public class OcurrencyElement {

    public static void main(String[] args) {
        String csv = "1,2,3,4,5,5,5,6,6,8,8,8,5,3,1,0";

        List<Integer> numbers = Arrays.stream(csv.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(Integer num: numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0) + 1);
        }

        System.out.println(frequencyMap);
    }
}
