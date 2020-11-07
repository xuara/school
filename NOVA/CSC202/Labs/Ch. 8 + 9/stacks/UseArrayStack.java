package ch03.stacks;

// @author Michael
public class UseArrayStack {

    public static void main(String[] args) {

        ArrayStack s = new ArrayStack(10);

        System.out.println("Exercise 3.29 (the toString method):");
        s.push(3);
        s.push(2);
        s.push(1);
        s.push("Testing");

        System.out.print(s.toString() + "\n");

        System.out.println("Exercise 3.33 (inspector method):");

        System.out.println("The top element is:");
        System.out.println(s.inspector(1));

        System.out.println("The next element is:");
        System.out.println(s.inspector(2));

        System.out.println("The next element is:");
        System.out.println(s.inspector(3));

        System.out.println("The next element is:");
        System.out.println(s.inspector(4));

        System.out.println();
        System.out.println("Exercise 3.34 (popSome method):");
        s.popSome(2);
        System.out.print("Current stack: \n" + s.toString());
    }
}
