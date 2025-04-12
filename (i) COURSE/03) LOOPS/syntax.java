// Basic syntax loop in java | Question: Print numbers from 1 to 5
public class syntax {
    public static void main(String[] args) {

    // For Loop:
        for (int number = 1; number <= 5; number++) {
            System.out.print(number);
        }

        System.out.print("\n");

    // While Loop
        int num = 1;
        while (num <= 5) {
            System.out.print(num);
            num += 1;
        }

        System.out.print("\n");

    // Do-While Loop
        int n = 1;
        do {
            System.out.print(n);
            n++;
        } while (n <= 5);
    }
}
