// Circular Queue implements using linkedlist
class Linkedlistwithqueue {

    public static class Queue {
        private Node head = null;
        private Node tail = null;
        int size = 0;

        // Add element (enqueue)
        public void add(int value) {
            Node newQueue = new Node(value);
            if (tail == null) {
                head = tail = newQueue;
            } else {
                tail.next = newQueue;
                tail = newQueue;
                tail.next = head;
            }
            size++;
        }

        // Remove element (dequeue)
        public int remove() {
            if (tail == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            int headval = head.value;
            head = head.next;
            tail.next = head;
            size--;
            return headval;
        }

        // Peek
        public void peek() {
            System.out.println("Peek: " + head.value);
        }

        // isEmpty()
        public boolean isEmpty() {
            if (size == 0) {
                return true;
            }
            return false;
        }

        // Display
        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Node class
        private class Node {
            int value;
            Node next;

            public Node(int value) {
                this.value = value;
            }
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(23);
        q.add(98);
        q.add(45);
        q.add(68);
        q.add(12);
        q.add(74);
        System.out.println("Remove Element: " + q.remove());
        System.out.println("Size: " + q.size);
        q.display();
        q.peek();

    }

}