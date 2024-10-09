import java.util.HashMap;
import java.util.List;

public class SubsetChecker {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(2, 4);
        List<Integer> list3 = List.of(6, 7);
        System.out.println("Todos os elementos de list2 estão em list1? " + areAllElementsPresent(list1, list2));
        System.out.println("Todos os elementos de list3 estão em list1? " + areAllElementsPresent(list1, list3));
    }

    // Verify elements the list2 in list1
    public static boolean areAllElementsPresent(List<Integer> list1, List<Integer> list2) {
        HashMap<Integer, Boolean> elementMap = new HashMap<>();

        //persist in list1 to input elements
        for (Integer element : list1) {
            elementMap.put(element, true);
        }

        //persist in list2 to input element and compare with keys like do dictionary
        for (Integer element : list2) {
            if (!elementMap.containsKey(element)) {
                return false;
            }
        }

        return true;
    }
}