import java.util.Scanner;
import java.util.Stack; 

public class Tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka");
        System.out.print("Input: ");

        if (!input.hasNextInt()) return;
        int initialMomentum = input.nextInt();
        
        Stack<Integer> bounces = new Stack<>();
        int current = initialMomentum;
        
        while (current >= 1) {
            bounces.push(current);
            current = current / 2; 
        }
        
        StringBuilder output = new StringBuilder();
        while (!bounces.isEmpty()) {
            output.append(bounces.pop());
            if (!bounces.isEmpty()) {
                output.append(" ");
            }
        }
        
        System.out.println(output.toString());
    }
}