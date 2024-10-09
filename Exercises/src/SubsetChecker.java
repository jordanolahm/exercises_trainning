import java.util.HashMap;
import java.util.List;

public class SubsetChecker {

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(2, 4);
        List<Integer> list3 = List.of(6, 7);

        // Testando a função
        System.out.println("Todos os elementos de list2 estão em list1? " + areAllElementsPresent(list1, list2));
        System.out.println("Todos os elementos de list3 estão em list1? " + areAllElementsPresent(list1, list3));
    }

    // Método que verifica se todos os elementos de list2 estão presentes em list1
    public static boolean areAllElementsPresent(List<Integer> list1, List<Integer> list2) {
        HashMap<Integer, Boolean> elementMap = new HashMap<>();

        // Adiciona todos os elementos da primeira lista ao HashMap
        for (Integer element : list1) {
            elementMap.put(element, true);
        }

        // Verifica se todos os elementos da segunda lista estão presentes na primeira
        for (Integer element : list2) {
            if (!elementMap.containsKey(element)) {
                return false; // Se algum elemento não estiver presente, retorna false
            }
        }

        return true; // Todos os elementos da segunda lista estão presentes na primeira
    }
}