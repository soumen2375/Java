
class Singlylinkedlist {

    private Node head;
    private Node tail;
    private int size = 0;

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

    // Deleting:-
    // deleting first
    public int deletingFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return value;
    }

    // deleting last
    public int deletingLast() {
        // Node temp = head;
        // for (int i = 0; i < size - 2; i++) {
        // temp = temp.next;
        // }
        Node prev = get(size - 2);

        int value = tail.value;
        tail = prev;
        tail.next = null;
        size -= 1;
        return value;
    }

    // deleting anywhere
    public int deletingAny(int index) {
        Node prev = get(index - 1);

        int value = prev.next.value;
        // Node newNode = prev.next;
        // prev.next = newNode.next;
        prev.next = prev.next.next;

        return value;
    }

    // Get index
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Find:-
    public Node findNode(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
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