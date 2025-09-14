package Concepts;

public class Linkedlistwithstack {

    public static class Stack { // User defiend data structure
        Node head = null;
        int size = 0;

        // Push()
        void push(int x) {
            Node newnNode = new Node(x);
            if (head == null) {
                newnNode.next = null;
                head = newnNode;
                size++;
                return;
            }

            newnNode.next = head;
            head = newnNode;
            size++;
        }

        // Pop()
        int pop() {
            if (head == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            Node temp = head;
            head = temp.next;
            size--;
            return temp.value;
        }

        // Peek()
        int peek() {
            if (head == null) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return head.value;
        }

        
        // Size()
        int size() {
            return size;
        }

        // isEmpty()
        boolean isEmpty() {
            if (head == null) {
                return true;
            } else
                return false;
        }

        // Display
        void displayRec(Node firstNode){
            if(firstNode == null){
                return;
            }
            displayRec(firstNode.next);
            System.out.print(firstNode.value + " ");
        }
        void display(){
            System.out.print("Display: ");
            displayRec(head);
        }

        // Display Reverse()
        void displayRev() {
            Node temp = head;
            System.out.print("[");
            while (temp != null) {
                System.out.print(temp.value);

                if (temp.next != null) {
                    System.out.print("-> ");
                }
                temp = temp.next;
            }
            System.out.print("]");
        }

    }

    private static class Node { // user defiend data type
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(7);
        st.push(5);
        st.push(4);
        st.push(9);
        st.push(2);
        st.peek();
        st.pop();
        st.push(10);
        st.display();

    }
}