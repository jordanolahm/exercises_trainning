import java.util.Stack;

public class BalancedParentheses {

    public static void main(String[] args) {
        String input1 = "{[()]}"; // Exemplo válido
        String input2 = "{[(])}"; // Exemplo inválido
        String input3 = "{{[[(())]]}}"; // Exemplo válido
        String input4 = "{[}"; // Exemplo inválido

        // Testando a função
        System.out.println("A string \"" + input1 + "\" é balanceada? " + isBalanced(input1));
        System.out.println("A string \"" + input2 + "\" é balanceada? " + isBalanced(input2));
        System.out.println("A string \"" + input3 + "\" é balanceada? " + isBalanced(input3));
        System.out.println("A string \"" + input4 + "\" é balanceada? " + isBalanced(input4));
    }

    // Método que verifica se a string de parênteses está balanceada
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        // Itera sobre cada caractere da string
        for (char c : s.toCharArray()) {
            // Se o caractere é um dos símbolos de abertura, empilha
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Se é um dos símbolos de fechamento
            else if (c == ')' || c == '}' || c == ']') {
                // Verifica se a pilha está vazia ou se o símbolo de fechamento não corresponde ao símbolo de abertura
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        // Se a pilha estiver vazia no final, a string está balanceada
        return stack.isEmpty();
    }

    // Método auxiliar para verificar se os pares de símbolos correspondem
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }
}