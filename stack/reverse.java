import java.util.*;

public class reverse {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    // for reverse
    public static void reversenum(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reversenum(s);
        pushAtBottom(top, s);

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        reversenum(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }
    }
}