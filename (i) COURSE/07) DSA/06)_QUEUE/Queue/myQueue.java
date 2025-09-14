import java.util.*;

public class myQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Add elements
        q.add(25);
        q.offer(50);
        q.offer(10);
        q.offer(20);
        q.offer(30);

        // Peek (check head without removing)
        System.out.println("Head: " + q.peek());

        // Remove elements
        System.out.println("Removed: " + q.poll());
        System.out.println("Removed: " + q.remove());

        // Remaining queue
        System.out.println("Queue: " + q);
    }
}
