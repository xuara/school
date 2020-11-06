package fp_bankaccounttest;

/**
 * @author Michael Kester
 * @since July 7, 2015
 *
 * The purpose of this program is to create the BankAccount class and to outline
 * its methods.
 */
public class BankAccount {

    //declarations
    private final String accNam;
    private String acct;
    private static int numAccounts;
    private final int accNum;
    private double accBal, wAmt, dAmt;

    //constructor
    public BankAccount(String accNam, int accNum, double accBal) {
        this.accNam = accNam;
        this.accNum = accNum;
        this.accBal = accBal;
        numAccounts++;
    }

    //withdraw method
    public void withdraw(double wAmt) {
        if (accBal > wAmt) { //if withdraw amount is less than account balance
            accBal -= wAmt; //subtract withdraw amount from account balance
            //output message for user: echoes amount withdrawn
            System.out.println("Success! $" + wAmt + " withdrawn.");
        } else { //if account balance is less than withdraw amount
            //output message for user: informs user that withdraw can't happen
            System.out.println("\nInsufficient funds. Withdrawn failed.");
        }
    }

    //deposit method
    public void deposit(double dAmt) {
        accBal += dAmt; //adds deposit amount to account balance
        //output message for user: echoes amount deposited
        System.out.println("Success! $" + dAmt + " deposited.");
    }

    //inquiry method
    public void inquiry() {
        //output message for user: current account balance
        System.out.print("Account balance is currently: $" + accBal);
        System.out.println("\n");
    }

    //ToString method
    //this method formats the output for data stored in the constructor
    public String ToString() {
        acct = "Name: " + accNam + "\n" + "Balance: $" + accBal + "\n"
                + "Account Number: " + accNum + "\n";
        return acct;
    }

    //numAccounts method
    public static int numAccounts() {
        //output message for user: outputs number of accounts constructed
        System.out.print("Number of accounts: ");
        return numAccounts;
    }
}
