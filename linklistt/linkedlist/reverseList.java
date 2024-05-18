class LL {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int data) {
        node newNode = new node(data);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void reverseList() {
        if (head == null || head.next == null)

        {
            return;

        }
        node prev = head;
        node curr = head.next;
        while (curr != null) {
            node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;

    }

    public void printlist() {
        if (head == null) {
            System.out.println("the list  is empty");
            return;

        }
        node currentNode = head;
        while (currentNode != null) {
            System.out.print(" " + currentNode.data + " ->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

}

public class reverseList {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(11);
        list.addFirst(111);
        list.addFirst(1111);

        list.printlist();
        list.reverseList();
        list.printlist();
    }

}
