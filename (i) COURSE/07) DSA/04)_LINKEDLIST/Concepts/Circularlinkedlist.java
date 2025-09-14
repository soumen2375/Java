
public class Circularlinkedlist {
    private Node head;
    private Node tail;
    private int size = 0;

    // Insert:-
    // insert inFirst
    public void insertFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
            size++;
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        head = newNode;
        size++;
    }

    // insert inLast
    public void insertLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            insertFirst(value);
            return;
        }

        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    // Insertion anywhere
    public void insertAny(int value, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (head == null) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(value, temp.next);
        temp.next = newNode;
        size++;
    }

    // Display
    public void display() {
        Node temp = head;
        if (head != null) {

            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;

            } while (temp != head);
            System.out.print("HEAD \n\n");
        }
    }

    // Node Class:-
    private class Node {
        private int value;
        private Node next;

        // Constructor:1
        public Node(int value) {
            this.value = value;
        }

        // Constructor:2
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
