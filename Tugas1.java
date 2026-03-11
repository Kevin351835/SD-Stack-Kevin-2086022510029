import java.util.*;

public class Tugas1 {
    
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== BRACKET CHECKER ===");
        System.out.println("Masukkan string bracket");
        System.out.print("Input: ");
        
        String input = scanner.nextLine();
        
        boolean result = isBalanced(input);
        
        if (result) {
            System.out.println("Output: balance");
        } else {
            System.out.println("Output: not balance");
        }
        
        scanner.close();
    }
}