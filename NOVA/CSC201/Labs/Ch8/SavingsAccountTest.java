package e86.pkg;
// @author Michael Kester

public class SavingsAccountTest {

    public static void main(String[] args) {

        //constructs two SavingsAccount objects
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        //sets the interest rate to 4%
        SavingsAccount.modifyInterestRate(.04);

        //Output
        System.out.println("Monthly balance for a year at 4%:");
        System.out.println("Balances");
        System.out.printf("%20s%10s%n", "saver1", "saver2");
        System.out.printf("%-10s%10s%10s%n", "Base", saver1.toString(),
                saver2.toString());

        // for loop that outputs the formatted monthly interest rate for a year
        for (int month = 1; month <= 12; month++) {
            String monthLabel = String.format("Month %d:", month);
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.printf("%-10s%10s%10s%n", monthLabel, saver1.toString(),
                    saver2.toString());
        }

        /* sets the interest rate to 5% and calculates the new monthly interest
        for each of the SavingsAccount objects
         */
        SavingsAccount.modifyInterestRate(.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        // outputs the next month's interest after setting interest rate to 5%
        System.out.println("\nAfter setting interest rate to 5%:");
        System.out.println("Balances:");
        System.out.printf("%-10s%10s%n", "saver1", "saver2");
        System.out.printf("%-10s%10s%n", saver1.toString(), saver2.toString());
    } // end main
} // end class SavingsAccountTest
