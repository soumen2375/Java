// Circular queue implementations with Array


class Arraywithqueue {
    int[] arr = new int[10];
    int rear = -1;
    int front = -1;
    int size = 0;

    // Add
    public void add(int value) {
        if (size == 0) {
            rear = front = 0;
            arr[0] = value;
        } else if (size == arr.length) { // check overflow
            System.out.println("Queue is full");
            return;
        } else if (rear == arr.length - 1) {
            rear = 0;
            arr[rear] = value;
        } else if (rear < arr.length - 1) {
            arr[++rear] = value;
        }
        size++;
    }

    // Remove
    public int remove() {
        if (size == 0) {
            System.out.println("Queue is empty");
            front = rear = 0;
            return -1;
        } else if (front == arr.length - 1) {
            int tempRemove = arr[front];
            front = 0;
            size--;
            return tempRemove;
        } else if (front <= arr.length - 1) {
            front++;
            size--;
        }
        return arr[front - 1];
    }

    // Display
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        } else if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else if (rear <= front) {
            // Front -> Array Length - 1
            for (int i = front; i <= arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            // Starting index -> Rear
            for (int j = 0; j <= rear; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
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
        System.out.println(q.size);
        q.display();

    }
}