
public class Doublylinkedlist {
    private Node head;
    private Node tail;
    private int size = 0;

    // Insertion:-
    // insert inFirst
    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        newNode.prev = null;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // insert inLast
    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        newNode.prev = tail;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size += 1;
    }

    // insert anywhere
    public void insertAny(int value, int index) {
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
        Node newNode = new Node(temp, value, temp.next);
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;
    }

    // Display:-
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END \n\n");

        // Display Reversal
        while (tail != null) {
            System.out.print(tail.value + " -> ");
            tail = tail.prev;
        }
        System.out.print("START \n\n");
    }

    // Node Class
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(Node prev, int value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }
    }
}
