package ch06.lists;

// @author Michael
public class ArrayUnsortedListTest {

    public static void main(String[] args) {
        ArrayUnsortedList tList = new ArrayUnsortedList(5);
        tList.add(10);
        tList.add("Test");
        tList.add(23.56f);
        tList.add(1234.5);
        tList.add("Test");
        System.out.println("Initial " + tList);

        System.out.println("isEmpty method (Exercise 6.23): " + tList.isEmpty());

        System.out.println();
        System.out.println("removeAll method (Exercise 6.24): "
                + tList.removeAll("Test"));
        System.out.println("After removeAll(): \n" + tList);
    }
}
