package ch08.trees;

// @author Michael
import support.*;

public class Exercises extends BinarySearchTree {

    // Exercise 8.15
    /* returns a count of the number of nodes in a binary search tree that
    contains a value less than or equal to the argument value */
    static int countLess(BinarySearchTree<Golfer> tree, Golfer maxValue) {
        int count = 1;
        Golfer g;
        int a = tree.reset(1);
        for (int i = 0; i < a; i++) {
            g = tree.getNext(1);
            if (g.compareTo(maxValue) == -1) {
                count++;
            }
        }
        return count;
    }

    // Exercise 8.16
    // returns the reference to the node with the minimum value
    static Golfer min(BinarySearchTree<Golfer> tree) {
        Golfer g = new Golfer("bob", 2);
        int b = tree.reset(1);
        for (int i = 0; i < b; i++) {
            g = tree.getNext(1);
            if (g.compareTo(g) == 0) {
                return g;
            }
        }
        return g;
    }

    // Exercise 8.17
    // returns the reference to the node with the maximum value
    static Golfer max(BinarySearchTree<Golfer> tree) {
        Golfer g = new Golfer("bob", 2);
        int b = tree.reset(1);
        for (int i = 0; i < b; i++) {
            g = tree.getNext(1);
            if (g.compareTo(g) == 1 || g.compareTo(g) == -1) {
                return g;
            }
        }
        return g;
    }

    public static void main(String[] args) {
        BinarySearchTree<Golfer> tree = new BinarySearchTree();

        Golfer bob = new Golfer("Bob", 10);
        Golfer john = new Golfer("John", 4);
        Golfer bill = new Golfer("Bill", 13);
        Golfer hank = new Golfer("Hank", 2);
        Golfer steve = new Golfer("Steve", 8);

        tree.add(bob);
        tree.add(john);
        tree.add(bill);
        tree.add(hank);
        tree.add(steve);

        // testing Exercise 8.15
        System.out.println("Exercise 8.15 (countLess method): "
                + countLess(tree, john));

        // testing Exercise 8.16
        System.out.println("Exercise 8.16 (min method): "
                + min(tree));

        // testing Exercise 8.17
        System.out.println("Exercise 8.17 (max method): "
                + max(tree));

        // testing Exercise 8.22
        System.out.println("Exercise 8.22 (leafCount method): "
                + tree.leafCount());

        // testing Exercise 8.23
        System.out.println("Exercise 8.23 (singleParentCount method): "
                + tree.singleParentCount());
    }
}
