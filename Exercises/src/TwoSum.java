import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // call method to find indexes
        int[] result = findTwoSum(nums, target);

        // Show result
        if (result != null) {
            System.out.println("Os índices dos números que somam " + target + " são: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Nenhum par encontrado que soma " + target);
        }
    }

    // Method to find index of booth elements that plus result
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate diff between

            // Verify if the diff already exist in map
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i }; // Return indexes
            }

            // Adding current number and index in map
            numMap.put(nums[i], i);
        }

        return null;
    }
}