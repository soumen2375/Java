public class Arraywithqueue {
    int[] arr = new int[10];
    int front = -1;
    int rear = -1;
    int size = 0;

    // Add element (enqueue)
    public void add(int value) {
        if (rear == arr.length - 1) { // check overflow
            System.out.println("Queue is full");
            return;
        }

        if (front == -1 && rear == -1) { // first element
            front = rear = 0;
            arr[rear] = value;
        } else {
            arr[++rear] = value;
        }
        size++;
    }

    // Remove element (dequeue)
    public int remove() {
        if (front > rear || size == 0) {
            System.out.println("Queue is empty");
            front = rear = 0;
            return -1;
        }
        front++;
        size--;
        return arr[front - 1];
    }

    // Peek
    public void peek() {
        System.out.println("Peek: " + arr[front]);
    }

    // isEmpty()
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    // Display element
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Arraywithqueue q = new Arraywithqueue();
        q.add(23);
        q.add(98);
        q.add(45);
        q.add(68);
        q.add(12);
        q.add(74);
        System.out.println(q.remove());
        System.out.println(q.isEmpty());
        System.out.println(q.size);
        q.display();
        q.peek();

    }
}
