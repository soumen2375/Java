//Calcualate simple interest

import java.util.Scanner;
public class problem_04 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.print("Enter principle amount: ");
        double principle_amount = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double interest = sc.nextDouble();
        System.out.print("Enter times in years: ");
        double time_years = sc.nextDouble();

        double simple_interest = (principle_amount * interest * time_years) / 100;
        System.out.print("Simple interest is: "+simple_interest);

        sc.close();
    }
}
