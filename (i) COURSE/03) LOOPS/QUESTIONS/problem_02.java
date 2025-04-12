// WAP that utilizes a while loop to print the squares of numbers from 1 to 5
package QUESTIONS;
public class problem_02 {
    public static void main(String[] args) {
        int num = 5;

        int i = 1;
        while (i <= num) {
            System.out.println(i * i + " ");
            i++;
        }
    }
}