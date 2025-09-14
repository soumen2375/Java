// Copy stack into another stack in same order
package Problems;

import java.util.Scanner;
import java.util.Stack;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Acctual Stack
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter the number of elments add into stack: ");
        int num = sc.nextInt();
        System.out.print("Enter the elemens: ");
        for(int i = 1; i <= num; i++){
            st.push(sc.nextInt());
        }
        System.out.println("Acctual Stack: " + st);

        // Reverse Stack
        Stack<Integer> st2 = new Stack<>();
        while (st.size() > 0) {
            st2.push(st.pop());
        }
        System.out.println("Reverse Stack: " + st2);

        // Copy Stack
        Stack<Integer> st3 = new Stack<>();
        while (st2.size() > 0) {
            st3.push(st2.pop());
        }
        System.out.println("Copy Stack: " + st3);

        sc.close();
    }
}
