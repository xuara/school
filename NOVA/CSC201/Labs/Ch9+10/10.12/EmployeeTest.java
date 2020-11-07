package e1012.pkg;
// @author Michael

public class EmployeeTest {

    public static void main(String[] args) {

        Date bDateS = new Date(1, 1, 1234);
        Date bDateH = new Date(4, 1, 5678);
        Date bDateC = new Date(8, 7, 9101);
        Date bDateB = new Date(12, 25, 1121);

        // create subclass objects
        SalariedEmployee salariedEmployee = new SalariedEmployee("John",
                "Smith", "111-11-1111", 800.00, bDateS);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price",
                "222-22-2222", 16.75, 40, bDateH);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue",
                "Jones", "333-33-3333", 10000, .06, bDateC);
        BasePlusCommissionEmployee basePlusCommissionEmployee
                = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444",
                        5000, .04, 300, bDateB);

        // create four-element Employee array
        Employee[] employees = new Employee[4];

        // initialize array with Employees
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

        System.out.printf("Employees processed polymorphically:%n%n");

        for (int cMonth = 1; cMonth < 13; cMonth++) {

            String monthString;
            switch (cMonth) {
                case 1:
                    monthString = "January";
                    break;
                case 2:
                    monthString = "February";
                    break;
                case 3:
                    monthString = "March";
                    break;
                case 4:
                    monthString = "April";
                    break;
                case 5:
                    monthString = "May";
                    break;
                case 6:
                    monthString = "June";
                    break;
                case 7:
                    monthString = "July";
                    break;
                case 8:
                    monthString = "August";
                    break;
                case 9:
                    monthString = "September";
                    break;
                case 10:
                    monthString = "October";
                    break;
                case 11:
                    monthString = "November";
                    break;
                case 12:
                    monthString = "December";
                    break;
                default:
                    monthString = "Invalid month";
                    break;
            }
            System.out.println("The current month is: " + monthString);
            System.out.println();

            // generically process each element in array employees
            for (Employee currentEmployee : employees) {
                System.out.println(currentEmployee); // invokes toString

                if (cMonth == currentEmployee.getBirthday().getMonth()) {
                    System.out.printf("earned $%,.2f. %s\n\n",
                            currentEmployee.earnings() + 100.00, "Note: added a"
                            + " $100 bonus to your total earnings since"
                            + " it is your birth month");
                } else {
                    System.out.printf("earned $%,.2f\n\n",
                            currentEmployee.earnings());
                } // end else
            } // end employee for loop
        } // end monthly for loop
    } // end main
} // end class EmployeeTest
