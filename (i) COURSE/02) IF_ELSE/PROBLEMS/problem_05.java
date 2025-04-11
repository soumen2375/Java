//Print profit/loss if SP and CP are given
import java.util.Scanner;

public class problem_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        if (sc.hasNextDouble()) {
            double cost_price = sc.nextDouble();

            System.out.print("Enter Selling Price: ");
            if (sc.hasNextDouble()) {
                double sell_price = sc.nextDouble();

                if (cost_price < sell_price) {
                    double profit = sell_price - cost_price;
                    System.out.println("Seller made a profit of Rs." + profit);
                } else if (cost_price > sell_price) {
                    double loss = cost_price - sell_price;
                    System.out.println("Seller made a loss of Rs." + loss);
                } else {
                    System.out.println("No Profit, No Loss.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid selling price.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid cost price.");
        }

        sc.close();
    }
}
