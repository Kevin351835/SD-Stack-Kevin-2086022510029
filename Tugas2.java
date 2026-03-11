import java.util.*;

public class Tugas2 {
    
    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int divisor = stack.pop();
                    int dividend = stack.pop();
                    stack.push(dividend / divisor);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }
        
        return stack.pop();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan angka");
        System.out.print("Input: ");
        
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");
        
        try {
            int result = evaluateRPN(tokens);
            System.out.println("Hasil: " + result);
        } catch (Exception e) {
            System.out.println("Kode yang ada masukkan tidak valid");
        }
        
        scanner.close();
    }
}