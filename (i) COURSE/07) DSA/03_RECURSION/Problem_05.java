// Calculate sum of digits of a positive number using recursion
public class Problem_05 {
    public static void main(String[] args) {
        int x = 55;
        System.out.println(sum(x));
        System.out.println(sumAlt(x));
    }

    static int sum(int x) {
        int sum;
        if (x != 0) {
            sum = (x % 10) + sum(x / 10);
        } else {
            return 0;
        }
        return sum;
    }

    // Alternative solutions
    static int sumAlt(int x) {
        if (x % 10 == x) {
            return x;
        }
        return (x % 10) + sumAlt(x / 10);
    }
}
