package application;

import java.util.Locale;
import java.util.Scanner;

//import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print(" --> Amount: ");
        double amount = sc.nextDouble();
        System.out.print("--> Months: ");
        int months = sc.nextInt();

        InterestService is = new UsaInterestService(1.0);
        // InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.print("Payment after " + months + "  Months = ");
        System.out.print(String.format("%.2f ", payment));
        ;

        sc.close();

    }
}
