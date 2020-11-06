package e710.pkg;
// @author Michael Kester

/* All but the withdraw method and its comments taken from figure 7.8 in the 
textbook */

 /* Account class with a double instance variable balance and a constructor
and deposit method that perform validation */
public class Account {

    private String name; //instance variable
    private double balance; //instance variable

    //Account constructor that receives two parameters
    public Account(String name, double balance) {
        this.name = name; //assign name to instance variable name

        /*validate that the balance is greater than 0.0; if it's not, instance
        variable balance keeps its default initial value of 0.0 */
        if (balance > 0.0) { //if the balance is valid
            this.balance = balance; //assign it to instance variable balance
        }
    }

    //method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) { //if the depositAmount is valid
            balance += depositAmount; //add it to the balance
        }
    }

    //method that withdraws (subtracts) only a valid amount from the balance
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance) { //if the withdrawAmount is valid
            balance -= withdrawAmount; //subtract it from the balance
        } else { //if withdrawAmount is not valid
            System.out.println("Withdrawal amount exceeded balance.");
            System.out.println();
            //outputs error message
        }
    }

    //method returns the account balance
    public double getBalance() {
        return balance;
    }

    //method that sets the name
    public void setName(String name) {
        this.name = name;
    }

    //method that returns the name
    public String getName() {
        return name;
    } //end method getName
} //end class Account
