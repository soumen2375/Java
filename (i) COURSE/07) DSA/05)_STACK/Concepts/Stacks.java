package Concepts;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // Push() -> Inserting element into stack
        // st.push(5);
        // st.push(7);
        // st.push(12);
        // st.push(45);
        // st.push(58);
        System.out.println(st);
        
        // Peek() -> Showing top element in the stack
        System.out.println(st.peek());

        // Pop() -> Removing element from stack
        st.pop();
        System.out.println(st);

        // Size -> Showing what is the size of stack
        System.out.println("Size is: " + st.size());

        // isEmpty() -> to check stack stack is empty or not , return in Boolean value
        System.out.println(st.isEmpty());

    }
}