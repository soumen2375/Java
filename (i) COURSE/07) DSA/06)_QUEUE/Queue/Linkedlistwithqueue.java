// Simple Queue implements using linkedlist
class Linkedlistwithqueue {

    public static class Queue {
        private Node front = null;
        private Node rear = null;
        int size = 0;

        // Add element (enqueue)
        public void add(int value) {
            Node newQueue = new Node(value);
            if (rear == null) {
                front = rear = newQueue;
            } else {
                rear.next = newQueue;
                rear = newQueue;
            }
            size++;
        }

        // Remove element (dequeue)
        public int remove() {
            if (rear == null) {
                System.out.println("Queue is empty");
                return -1;
            }
            int frontval = front.value;
            front = front.next;
            size--;
            return frontval;
        }

        // Peek
        public void peek() {
            System.out.println("Peek: " + front.value);
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
            Node temp = front;
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
        System.out.println(q.remove());
        System.out.println(q.size);
        q.display();
        q.peek();

    }

}