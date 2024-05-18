import java.util.*;

class qq {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    boolean isEmpty() {
        return s1.isEmpty();

    }

    public void add(int data) {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()) {

            s1.push(s2.pop());
        }
    }

    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        return s1.pop();
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return s1.peek();
    }
}

public class queuefromstack {
    public static void main(String[] args) {

        qq q = new qq();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
