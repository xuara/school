package e1014.pkg;
// @author Michael Kester

public class PayrollSystemTest {

    public static void main(String[] args) {

        // create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee("John",
                "Smith", "111-11-1111", 800.00);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price",
                "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue",
                "Jones", "333-33-3333", 10000, .06);
        BasePlusCommissionEmployee basePlusCommissionEmployee
                = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",
                        5000, .04, 300);
        PieceWorker pieceWorker = new PieceWorker("Lester", "Nubles",
                "123-45-6789", 5, 25);

        // create five-element Employee array
        Employee[] employees = new Employee[5];

        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;

        System.out.printf("Employees processed polymorphically:%n%n");

        // generically process each element in array employees
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee); // invokes toString

            System.out.printf(
                    "earned $%,.2f%n%n", currentEmployee.earnings());
        }
    } // end main
} // end class PayrollSystemTest
