//Basic syantax of nested switch case
import java.util.Scanner;                   

public class nested_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Country Name: (like= 'India')");
        String country = sc.nextLine().toLowerCase();

        System.out.println("Enter State Name: (like= 'West Bengal')");
        String state = sc.nextLine().toLowerCase();

        switch (country) {
            case "india" -> {
                switch (state) {
                    case "west bengal" -> System.out.print("West Bengal Capital is Kolkata");
                    case "maharashtra" -> System.out.print("Maharashtra Capital is Mumbai");
                    case "karnataka" -> System.out.print("Karnataka Capital is Bengaluru");
                    case "tamil nadu" -> System.out.print("Tamil Nadu Capital is Chennai");
                    case "gujarat" -> System.out.print("Gujarat Capital is Gandhinagar");
                    default -> System.out.print("Choose a valid state");
                }
            }

            default -> System.out.print("Choose a valid Country");
        }

        sc.close();
    }
}
