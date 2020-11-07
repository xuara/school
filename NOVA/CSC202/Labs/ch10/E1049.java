package ch10;

// @author Michael
import java.util.*;

public class E1049 {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a string: ");

            String input = kb.nextLine();
            System.out.println("Your string as hashcode is: "
                    + input.hashCode());
            System.out.print("Convert another string? ('no' to stop): ");
            String resp = kb.nextLine();
            if (resp.equals("no")) {
                break;
            }
        }
    }
}
