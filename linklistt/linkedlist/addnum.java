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

    public void addlast(int data) {
        node newNode = new node(data);
        node currentNode = head;
        if (isEmpty()) {
            newNode = head;
            return;
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;

    }

    public void delFirst() {
        if (isEmpty()) {
            System.out.println("the list is empty");
            return;
        }
        head = head.next;

    }

    public void dellast() {
        if (isEmpty()) {
            System.out.println("the list is empty");
            return;
        }
        node secondLast = head;
        node last = head.next;
        while (last.next != null) {
            secondLast = secondLast.next;
            last = last.next;
        }
        secondLast.next = null;

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

public class addnum {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(11);
        list.addFirst(111);
        list.addFirst(1111);
        list.addlast(44);

        list.printlist();
        list.delFirst();
        list.printlist();
        list.dellast();
        list.printlist();
    }

}
