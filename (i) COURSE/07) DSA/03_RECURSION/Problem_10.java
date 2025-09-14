// Reverse of a number
public class Problem_10 {

    static int reverse(int num, int arg) {
        if (num % 10 == num) {
            return num;
        }
        int rem = num % 10;
        int reverse = rem * (int) Math.pow(10, arg) + reverse(num / 10, arg - 1);
        return reverse;
    }

    static int rev2(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n%10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    // Alternative solutions
    static int sum = 0;
    static void reverseAlt(int num) {
        if (num == 0) {
            return;
        }
        sum = sum * 10 + (num % 10);
        reverseAlt(num / 10);
    }


    public static void main(String[] args) {
        int x = 51234;
        System.out.println(rev2(x));
        reverseAlt(x);
        System.out.println(sum);
    }
}
