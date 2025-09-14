// factorial of n to 1 number
public class Problem_08 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(fact(num));
    }

    static int fact(int num){
        if(num == 1){
            return 1;
        }

        return num * fact(num - 1);
    }
}
