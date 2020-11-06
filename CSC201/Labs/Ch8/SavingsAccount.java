package e86.pkg;
// @author Michael Kester

public class SavingsAccount {

    private static double annualInterestRate; // instance variable
    private double savingsBalance; // instance variable

    // constructor
    public SavingsAccount(double bal) {
        savingsBalance = bal;
    }

    /*
    calculates monthly interest using the given formula:
    annual interest rate divided by 12, multiplied by savings balance, then
    all added to the savings balance
     */
    public void calculateMonthlyInterest() {
        savingsBalance += savingsBalance * (annualInterestRate / 12);
    }

    // basically a set method; sets the annual interest rate to given input
    public static void modifyInterestRate(double intRate) {
        annualInterestRate = intRate;
    }

    // formats output via toString
    public String toString() {
        return String.format("$%.2f", savingsBalance);
    } // end method toString
} // end class SavingsAccount
