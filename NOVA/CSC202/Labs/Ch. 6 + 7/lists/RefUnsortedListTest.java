package ch06.lists;

// @author Michael
public class RefUnsortedListTest {

    public static void main(String[] args) {
        RefUnsortedList rl = new RefUnsortedList();
        rl.add(10);
        rl.add("Test");
        rl.add(67.89f);
        rl.add(1234.5);
        rl.add("Test");
        System.out.println("Initial " + rl);

        System.out.println("removeAll method (Exercise 6.51): "
                + rl.removeAll("Test"));
        System.out.println("After removeAll(): \n" + rl);

        System.out.println("endInsert method (Exercise 6.55):");
        rl.endInsert("In the End");
        System.out.println("After endInsert(): \n" + rl);

    }
}
