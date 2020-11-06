package e144.pkg;

// @author Michael Kester
public class DateApp {

    public static void main(String[] args) {

        Date array[] = new Date[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Date(12, i+1, 2005);
        }

        //prints the array
        for (Date a : array) {
            System.out.println(a);
        }
    }
}
