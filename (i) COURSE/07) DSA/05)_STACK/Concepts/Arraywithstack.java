// Stack implementation using Array
package Concepts;

public class Arraywithstack {

    public static class Stack {
        private int[] arr = new int[5];
        private int indx = 0;

        // Push()
        void push(int x) {
            if (indx + 1 > arr.length) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[indx] = x;
            indx++;
        }

        // Pop()
        int pop() {
            if (indx == 0) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int popElement = arr[indx - 1];
            arr[indx - 1] = 0;
            indx--;

            return popElement;
        }

        // Peek()
        int peek() {
            if (indx == 0) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[indx - 1];
        }

        // Size()
        int size() {
            return indx;
        }

        // isEmpty()
        boolean isEmpty() {
            if (indx == 0) {
                return true;
            } else
                return false;
        }

        // isFull()
        boolean isFull() {
            if (indx == arr.length) {
                return true;
            } else
                return false;
        }

        // Display()
        void display() {
            System.out.print("[");
            for (int i = 0; i < indx; i++) {
                System.out.print(arr[i]);
                if (i < indx - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
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
        st.display();

    }

}