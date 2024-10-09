import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Chama o método para encontrar os índices
        int[] result = findTwoSum(nums, target);

        // Exibe o resultado
        if (result != null) {
            System.out.println("Os índices dos números que somam " + target + " são: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Nenhum par encontrado que soma " + target);
        }
    }

    // Método que encontra os índices dos dois números que somam o alvo
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calcula a diferença necessária

            // Verifica se a diferença já está no mapa
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i }; // Retorna os índices
            }

            // Adiciona o número atual e seu índice ao mapa
            numMap.put(nums[i], i);
        }

        return null;
    }
}