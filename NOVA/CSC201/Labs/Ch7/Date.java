package e713.pkg;
// @author Michael

public class Date {

    private int month;
    private int day;
    private int year;

    //constructor that receives three parameters
    public Date(int month, int day, int year) {
        if (month >= 1 && month <= 12) { //if month is valid (1-12)
            this.month = month; //assign month to instance variable month
        }

        if (day >= 1 && day <= 31) { //if day is valid (1-31)
            this.day = day; //assign day to instance variable day
        }

        this.year = year; //assign year to instance variable year
    }

    //method that sets the month
    public void setMonth(int month) {
        this.month = month;
    }

    //method that sets the day
    public void setDay(int day) {
        this.day = day;
    }

    //method that sets the year
    public void setYear(int year) {
        this.year = year;
    }

    //method that returns the month
    public int getMonth() {
        return month;
    }

    //method that returns the day
    public int getDay() {
        return day;
    }

    //method that returns the year
    public int getYear() {
        return year;
    }

    //method that displays the date
    public void displayDate() {
        if (month >= 1 && month <= 12 && day >= 1 && day <= 31) {
            System.out.printf("The date you inputted is: %d/%d/%d%n", month,
                    day, year);
        } else {
            System.out.println("Invalid date inputted.");
        }
    } //end method displayDate
} //end class Date
