
public class Problem_07 {
    public static void main(String[] args) {
        int num = 5;
        funBoth(num);
    }

    // Simple n to 1 number printing
    static void fun(int num) {

        // Base condition
        if (num == 1) {
            System.out.println(num);
            return;
        }

        System.out.println(num);
        fun(num - 1);
    }

    // Simple 1 to n number printing
    static void funReverse(int num) {

        // Base condition
        if (num == 1) {
            System.out.println(num);
            return;
        }

        funReverse(num - 1);
        System.out.println(num);
    }

    // Simple n to 1 & 1 to n number printing
    static void funBoth(int num) {

        // Base condition
        if (num == 0) {
            return;
        }

        System.out.println(num);
        funBoth(num - 1);
        System.out.println(num);
    }
}
