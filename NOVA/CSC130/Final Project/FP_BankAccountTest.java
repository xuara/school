package fp_bankaccounttest;

/**
 * @author Michael
 * @since July 7, 2015
 *
 * The purpose of this program is to test the BankAccount class and its methods.
 */
public class FP_BankAccountTest {

    public static void main(String[] args) {

        //random numbers used for the bank account number for each bank account
        int r = (int) Math.floor(Math.random() * 999999999);
        int r2 = (int) Math.floor(Math.random() * 999999999);

        /*
         Creates a new BankAccount called mike with account name "Mike", a
         random account number, and inital balance of $500
         */
        BankAccount mike = new BankAccount("Mike", r, 500);
        //outputs Mike's account information using the ToString method
        System.out.println(mike.ToString());
        mike.deposit(500); //deposits $500 into Mike's account
        mike.inquiry(); //calls the inquiry method for Mike's account

        /*
         Creates a new BankAccount called susan with account name "Susan",
         another random account number, and inital balance of $100
         */
        BankAccount susan = new BankAccount("Susan", r2, 100);
        //outputs Susan's account information using the ToString method
        System.out.println(susan.ToString());
        susan.withdraw(50); //withdraws $50 from Susan's account
        susan.inquiry(); //calls the inquiry method for Susan's account
        //attempts to withdraw an additional $70 from Susan's account
        susan.withdraw(70);
        susan.inquiry(); //calls the inquiry method again for Susan's account

        /*
         Outputs the total number of bank accounts generated via the static
         numAccounts method
         */
        System.out.println(BankAccount.numAccounts());
    }
}
