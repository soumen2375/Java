import java.util.Arrays;
import java.util.Scanner;

public class Array_Syntax {
    public static void main(String[] args) {
        /*
         * datatype[] var_name = new datatype[size of array];
         * or
         * datatype[] var_name = {values};
         */

        // Integer Array
        int[] number = { 1, 2, 3, 4, 5 };
        System.out.println(number[0]);

        // String Array
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(cars[0]);

        // Input in Array
        inputArray();

        // Print in Array
        printArray();
    }

    public static void inputArray() {
        Scanner sc = new Scanner(System.in);
        int[] num2 = new int[5];

        System.out.print("Enter input number:");
        for (int i = 0; i < num2.length; i++) {
            num2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(num2));

        sc.close();
    }

    public static void printArray() {

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
    }
}