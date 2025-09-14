// write a function that takes in a number and prints it
// print first 5 numbers: 1 2 3 4 5

public class Problem_03 {
    public static void main(String[] args) {
        number(1);
    }

    static void number(int n) {
         // base condition
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);

        // recursive call
        // if you are calling a function again and again, you can treat it as a 'separate call' in the stack

        // this is called tail recursion
        // this is the last function call
        number(n + 1);
    }
}
