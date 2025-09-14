
public class MyLinkedList {
    Node head;
    private Node tail;
    int size = 0;

    // Inserting:-
    // inserting inFirst value
    public void insertFirst(int value) {
        Node newnode = new Node(value);
        newnode.next = head;
        head = newnode;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // inserting inLast value
    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node newnode = new Node(value);
        tail.next = newnode;
        tail = newnode;
        size += 1;
    }

    // inserting inAnywhere value
    public void insertAny(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newnode = new Node(value, temp.next);
        temp.next = newnode;
        size += 1;
    }

    // Display:-
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Node class
    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}