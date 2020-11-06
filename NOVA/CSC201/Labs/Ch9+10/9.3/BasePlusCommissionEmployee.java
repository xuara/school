package e93.pkg;

public class BasePlusCommissionEmployee {

    private final CommissionEmployee commissionEmployee; // composition
    private double baseSalary; // base salary per week

    // six-argument constructor
    public BasePlusCommissionEmployee(String firstName, String lastName,
            String socialSecurityNumber, double grossSales,
            double commissionRate, double baseSalary) {
        commissionEmployee = new CommissionEmployee(firstName, lastName,
                socialSecurityNumber, grossSales, commissionRate);

        // if baseSalary is invalid throw exception
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    } // end constructor

    // set base salary
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    } // end method setBaseSalary

    // return base salary
    public double getBaseSalary() {
        return baseSalary;
    } // end method getBaseSalary

    // calculate earnings
    public double earnings() {
        return getBaseSalary() + commissionEmployee.earnings();
    } // end method earnings

    // return String representation of BasePlusCommissionEmployee
    @Override
    public String toString() {
        return String.format("%s %s\n%s: %.2f", "base-salaried",
                commissionEmployee.toString(), "base salary", getBaseSalary());
    } // end method toString

    // return first name
    public String getFirstName() {
        return commissionEmployee.getFirstName();
    } // end method getFirstName

    // return last name
    public String getLastName() {
        return commissionEmployee.getLastName();
    } // end method getLastName

    // return social security number
    public String getSocialSecurityNumber() {
        return commissionEmployee.getSocialSecurityNumber();
    } // end method getSocialSecurityNumber

    // set commission employee's gross sales amount
    public void setGrossSales(double sales) {
        commissionEmployee.setGrossSales(sales);
    } // end method setGrossSales

    // return commission employee's gross sales amount
    public double getGrossSales() {
        return commissionEmployee.getGrossSales();
    } // end method getGrossSales

    // set commission employee's rate
    public void setCommissionRate(double rate) {
        commissionEmployee.setCommissionRate(rate);
    } // end method setCommissionRate

    // return commission employee's rate
    public double getCommissionRate() {
        return commissionEmployee.getCommissionRate();
    } // end method getCommissionRate
} // end class BasePlusCommissionEmployee
