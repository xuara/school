package e712.pkg;
// @author Michael Kester

public class Employee {

    private String fName;
    private String lName;
    public double mSalary;

    //Employee constructor that receives three parameters
    public Employee(String fName, String lName, double mSalary) {
        this.fName = fName; //assign fName to instance variable fName
        this.lName = lName; //assign lName to instance variable lName

        if (mSalary > 0.0) { //if mSalary is valid (positive)
            this.mSalary = mSalary;//assign mSalary to instance variable mSalary
        }
    }

    //method that sets the employee's first name
    public void setFName(String fName) {
        this.fName = fName;
    }

    //method that sets the employee's last name
    public void setLName(String lName) {
        this.lName = lName;
    }

    //method that sets the employee's monthly salary
    public void setMSalary(double mSalary) {

        if (mSalary > 0.0) {
            this.mSalary = mSalary;
        } else {
            this.mSalary = 0.0;
        }
    }

    //method that returns the employee's first name
    public String getFName() {
        return fName;
    }

    //method that returns the employee's last name
    public String getLName() {
        return lName;
    }

    //method that returns the employee's monthly salary
    public double getMSalary() {
        return mSalary;
    } //end method getMSalary
} //end class Employee
