package stack;

public class CustomStackTest {
    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack<>();
        stack.push(10);
        stack.push(50);
        stack.push(40);
        stack.push(15);
        stack.push(46);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());

    }
}
