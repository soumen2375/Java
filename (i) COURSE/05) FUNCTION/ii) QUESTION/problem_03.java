// Write a function to print all 3 digit Armstrong number

public class problem_03 {

    public static void armstrongCheck(int num) {
        int originalNum = num;
        int sum = 0;
        while (num >= 1) {
            int mod = num % 10;
            sum = sum + (mod * mod * mod);
            num = num / 10;
        }
        if (originalNum == sum) {
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            armstrongCheck(i);
        }
    }

}
