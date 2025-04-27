//Basic syantax of switch case
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your favourite foods: Mango Apple Orange Banana");
        String fruit = sc.next();

        /*
         * Old Way
         * switch (fruit) {
         * case "Mango":
         * System.out.println("Mango is my favourite food");
         * break;
         * case "Apple":
         * System.out.println("Apple is my favourite food");
         * break;
         * case "Orange":
         * System.out.println("Orange is my favourite food");
         * break;
         * case "Banana":
         * System.out.println("Banana is my favourite food");
         * break;
         * default:
         * System.out.println("Please choose a valid fruit");
         * }
         */

        // Enhanced Way(Here don't req. write Break statement manuallyit automatically given inside )
        switch (fruit) {
            case ("Mango") -> System.out.println("Mango is my favourite food");
            case ("Apple") -> System.out.println("Apple is my favourite food");
            case ("Orange") -> System.out.println("Orange is my favourite food");
            case ("Banana") -> System.out.println("Banana is my favourite food");
            default -> System.out.println("Please choose a valid fruit");
        }

        sc.close();
    }
}
