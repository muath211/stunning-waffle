import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);

        System.out.println(s);
        reverseStack(s);
        System.out.println(s);

    }


    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int item = stack.pop();
        reverseStack(stack);
        addToBottom(stack, item);
    }

    private static void addToBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int temp = stack.pop();
        addToBottom(stack, item);
        stack.push(temp);
    }

}
