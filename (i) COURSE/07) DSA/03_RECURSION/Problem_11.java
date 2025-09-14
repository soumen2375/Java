// n-th fibonacci series
public class Problem_11 {
    public static void main(String[] args) {
        int ans = fibo(50);
        System.out.println(ans);
    }

    static int fibo(int n) {
        int fiboAns = (int)(Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
        return fiboAns;
    }
}

