import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack elements:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}