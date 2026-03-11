import java.util.*;

public class Tugas4 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] nums = input.nextLine().trim().split(" ");
        
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> sorted = new Stack<>();
        
        for (String n : nums) stack.push(Integer.parseInt(n));
        
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            while (!sorted.isEmpty() && sorted.peek() > curr) 
                stack.push(sorted.pop());
            sorted.push(curr);
        }
        
        while (!sorted.isEmpty()) 
            System.out.print(sorted.pop() + (sorted.isEmpty() ? "" : " "));
    }
}