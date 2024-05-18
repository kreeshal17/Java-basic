
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

    public void removeNode() {
        if (head == null || head.next == null) {
            return;
        }

        node curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        int needed = size - 2;
        int i = 1;
        // if (size==5)
        // {
        // head.next=head;
        // return;
        // }
        node prev = head;
        while (i < needed) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;

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

public class removenthnodefromright {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(11);
        list.addFirst(111);
        list.addFirst(1111);
        list.addFirst(111111);
        list.addFirst(211111);

        list.printlist();
        list.removeNode();
        list.printlist();

    }

}
