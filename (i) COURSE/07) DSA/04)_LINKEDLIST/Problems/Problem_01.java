// Remove duplicates from sorted list

class Problem_01 {
    private Node head;
    private Node tail;
    int size = 0;

    // Remove Duplicates
    public void removeduplicate() {
        Node temp = head;
        while (temp.next != null) {
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                size --;
            } else{
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }

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
    private class Node {
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

    public static void main(String[] args) {
        Problem_01 li = new Problem_01();
        li.insertLast(1);
        li.insertLast(1);
        li.insertLast(1);
        li.insertLast(2);
        li.insertLast(4);
        li.insertLast(4);

        li.display();

        li.removeduplicate();
        li.display();
    }
}