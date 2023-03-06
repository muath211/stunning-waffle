import java.util.Objects;
import java.util.Stack;

public class MinStack {

    Stack<Integer> values = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(5);
        minStack.push(7);
        minStack.push(4);
        minStack.push(1);
        minStack.push(2);

        System.out.println("pop __ " + minStack.pop());
        System.out.println(minStack.min());
        System.out.println("pop __ " + minStack.pop());
        System.out.println(minStack.min());
        System.out.println("pop __ " + minStack.pop());
        System.out.println(minStack.min());
        System.out.println("pop __ " + minStack.pop());
        System.out.println(minStack.min());
        System.out.println("pop __ " + minStack.pop());
        System.out.println(minStack.min());
        System.out.println("pop __ " + minStack.pop());
        System.out.println(minStack.min());
        System.out.println("pop __ " + minStack.pop());
        System.out.println(minStack.min());


    }

    public int min() {
        if(min.empty()){
            throw new RuntimeException("EMpty");
        }
        return min.peek();
    }

    public void push(int x) {
        values.push(x);
        if (min.empty() || x < min.peek()) {
            min.push(x);
        }
    }

    public int pop() {
        if(values.empty()){
            throw new RuntimeException("EMpty");
        }
        if (Objects.equals(values.peek(), min.peek())) {
            min.pop();
        }
        return values.pop();
    }


}
