package e712.pkg;
// @author Michael Kester

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee("Michael", "Kester", 1337.50);
        Employee e2 = new Employee("Bob", "Smith", -800.85);
        Employee e3 = new Employee("Jane", "Doe", 1234.56);

        //displays e1's yearly salary
        System.out.printf("%s %s's yearly salary is: $%.2f%n",
                e1.getFName(), e1.getLName(),
                e1.getMSalary() * 12);
        //displays e2's yearly salary
        System.out.printf("%s %s's yearly salary is: $%.2f%n",
                e2.getFName(), e2.getLName(),
                e2.getMSalary() * 12);
        //displays e3's yearly salary
        System.out.printf("%s %s's yearly salary is: $%.2f%n%n",
                e3.getFName(), e3.getLName(),
                e3.getMSalary() * 12);

        //gives each employee a 10% raise
        e1.setMSalary(e1.getMSalary() * 1.1);
        e2.setMSalary(e2.getMSalary() * 1.1);
        e3.setMSalary(e3.getMSalary() * 1.1);

        //informs of raise
        System.out.printf("%s %s and %s %s and %s %s have all received a "
                + "10 percent raise!%n%n", e1.getFName(), e1.getLName(),
                e2.getFName(), e2.getLName(), e3.getFName(), e3.getLName());

        //displays e1's yearly salary
        System.out.printf("%s %s's yearly salary is now: $%.2f%n",
                e1.getFName(), e1.getLName(),
                e1.getMSalary() * 12);
        //displays e2's yearly salary
        System.out.printf("%s %s's yearly salary is now: $%.2f%n%n",
                e2.getFName(), e2.getLName(),
                e2.getMSalary() * 12);
    } //end main    
} //end class EmployeeTest
