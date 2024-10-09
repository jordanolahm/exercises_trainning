import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {
        String input1 = "{[()]}"; // Exemple
        String input2 = "{[(])}"; // Exemple
        String input3 = "{{[[(())]]}}"; // Exemple
        String input4 = "{[}"; // Exemple

        System.out.println("A string \"" + input1 + "\" é balanceada? " + isBalanced(input1));
        System.out.println("A string \"" + input2 + "\" é balanceada? " + isBalanced(input2));
        System.out.println("A string \"" + input3 + "\" é balanceada? " + isBalanced(input3));
        System.out.println("A string \"" + input4 + "\" é balanceada? " + isBalanced(input4));
    }

    // Balanced method
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        //compare elements char in string, convert to array.
        for (char c : s.toCharArray()) {
            // Verify the initial element in array
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // put element in stack
            }
            // Verify the final element in array
            else if (c == ')' || c == '}' || c == ']') {
                // verify to empty stack status or if the final symbol take correlation with initial symbol
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        // if stack is empty, the string is balanced.
        return stack.isEmpty();
    }

    // Auxiliar method to granted matching pair
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }
}