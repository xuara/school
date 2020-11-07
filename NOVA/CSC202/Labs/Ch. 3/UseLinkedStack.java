package ch03.stacks;

// @author Michael
public class UseLinkedStack {

    public static void main(String[] args) {
        LinkedStack s = new LinkedStack();

        System.out.println("Exercise 3.42 (the toString method):");
        s.push(3);
        s.push(2);
        s.push(1);
        s.push("Testing");

        System.out.println(s.toString());

        System.out.println("Exercise 3.43 (inspector method):");

        System.out.println("The top element is:");
        System.out.println(s.inspector(1));

        System.out.println("The next element is:");
        System.out.println(s.inspector(2));

        System.out.println("The next element is:");
        System.out.println(s.inspector(3));

        System.out.println("The next element is:");
        System.out.println(s.inspector(4));

        System.out.println();
        System.out.println("Exercise 3.44 (popSome method):");
        s.popSome(2);
        System.out.println("Current stack:");
        System.out.print(s.toString());

        System.out.println();
        System.out.println("Exercise 3.45 (popTop method):");
        s.push(1);
        s.push("Testing");
        System.out.println("Current stack:");
        System.out.print(s.toString() + "\n");
        System.out.println(s.popTop());
    }
}
