class LL {
    Node head;

    class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    boolean isEmpty() {
        return head == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;

    }

}

public class usingll {
    public static void main(String[] args) {
        LL stack = new LL();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        while (!stack.isEmpty()) {

            System.out.println(stack.peek());
            stack.pop();

        }

    }

}
